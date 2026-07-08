package Pattern.Easy;

import java.util.Scanner;

public class TrianglePattern {
    // Function to print Right Angle Triangle Pattern
    public void trianglePattern(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 0; j <= i; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
        for (int i = 0; i < N-1; i++) {
            // Inner loop to handle columns for each row
            for (int j = i; j < N-1; j++) {
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TrianglePattern sol = new TrianglePattern();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.trianglePattern(N);
        sc.close();
    }
}
