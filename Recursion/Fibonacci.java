package Recursion;

import java.util.*;

public class Fibonacci {
    // Function to check if a string is a palindrome 
    public static List<Integer> printFibonacci(int n) {
        int a=0;
        int b=1;
        List<Integer> list=new ArrayList<>();
        while(n>=0){
            list.add(a);
            int temp=a+b;
            a=b;
            b=temp;
            n--;
        }
        return list;
    }

    //Using Recursion
    public static int findFibonacci(int n) {
        if(n<=1){
            return n;
        }
        int last=findFibonacci(n-1);
        int slast=findFibonacci(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        List<Integer> result=printFibonacci(num);
        for(int e:result){
            System.out.print(e+ " ");
        }
        System.out.println();
        System.out.println(findFibonacci(num));

    }
    
}
