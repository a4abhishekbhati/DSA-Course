package Recursion;

import java.util.Scanner;

public class PrintReverseNumber {
    // Time Complexity: O(N), we print every number from N to 1 using recursion
    // Space Complexity: O(N), stack space used for recursive calls.
    //Forward Recursion
    // public static void printNumber(int N) {
    //     if(N==0){
    //         return;
    //     }
    //     System.out.print(N + " ");
    //     printNumber(N-1);
    // }

    // Time Complexity: O(N), we print every number from N to 1 using recursion
    // Space Complexity: O(N), stack space used for recursive calls.
    //Backtracking Recursion
    // public static void printNumbers(int current,int N) {
    //     // Base case: if current exceeds n, stop recursion
    //     if (current==0)
    //         return;

    //     // Recursive call with next number
    //     printNumbers(current-1,N);
    //     // Print current number
    //     System.out.print(N-current+1 + " ");
    // }
    public static void printNumbersInReverseOrder(int current,int N) {
        // Base case: if current exceeds n, stop recursion
        if (current>N)
            return;

        // Recursive call with next number
        printNumbersInReverseOrder(current+1, N);
        // Print current number
        System.out.print(current + " ");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        // printNumber(num);
        // printNumbers(num,num); 
        printNumbersInReverseOrder(1, num);
    }   
}
