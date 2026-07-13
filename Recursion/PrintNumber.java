package Recursion;

import java.util.Scanner;

public class PrintNumber {
    // Time Complexity: O(N), we print every number from 1 to N using recursion
    // Space Complexity: O(N), stack space used for recursive calls.
    //Forward Recursion
    public static void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;
        // Print current number
        System.out.print(current + " ");
        // Recursive call with next number
        printNumbers(current + 1, n);
    }

    // Time Complexity: O(N), we print every number from 1 to N using recursion
    // Space Complexity: O(N), stack space used for recursive calls.
    //Backtracking Recursion
    // public static void printNumber(int N) {
    //     if(N==0){
    //         return;
    //     }
    //     printNumber(N-1);
    //     System.out.print(N + " ");
    // }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        // printNumber(num);
        printNumbers(1,num);
    }
    
}
