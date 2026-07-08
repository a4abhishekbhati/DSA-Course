package Pattern.Easy;

import java.util.Scanner;

public class SquarePattern {
    // Function to print a square pattern of stars
    public void squarePattern(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j < N; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SquarePattern sol = new SquarePattern();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.squarePattern(N); // Call the function to print the pattern
        sc.close();
    }
}
