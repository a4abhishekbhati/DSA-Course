package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
    // Time Complexity: O(N), we print our name exactly N times.
    // Space Complexity: O(N), stack space used for recursive calls. 
    public static void printName(int N) {
        if(N==0){
            return;
        }
        System.out.println("Abhishek Bhati");
        printName(N-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        printName(num);
        
    }
    
}
