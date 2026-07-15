package Recursion;

import java.util.Scanner;

public class FindSum {
    // Time Complexity: O(N),The function is called N times, with each call performing O(1) work.
    // Space Complexity: O(N),Due to recursive function calls being stored on the call stack, which grows linearly with N.
    public static int findSum(int N) {
        if(N==1){
            return 1;
        }
        return N+findSum(N-1);
    }
    public static void printSum(int N,int sum){
        if(N==0){
            System.out.println(sum);
            return;
        }
        printSum(N-1, sum+N);
    }

    //Using formula Time Complexity: O(1)  && Space Complexity: O(1)
    // public static int findSum(int N) {
    //     return (N*(N+1))/2;
    // }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        System.out.println(findSum(num));
        printSum(num, 0);
    }
    
}
