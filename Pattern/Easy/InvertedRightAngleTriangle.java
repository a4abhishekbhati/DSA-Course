package Pattern.Easy;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
    /// Function to print Inverted Right Angle Triangle Pattern
    public void invertedRightAngleTriangle(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = N; j > i; j--) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InvertedRightAngleTriangle sol = new InvertedRightAngleTriangle();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.invertedRightAngleTriangle(N); // Call the function to print the pattern
        sc.close();
    }
}

