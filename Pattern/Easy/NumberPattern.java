package Pattern.Easy;

import java.util.Scanner;

public class NumberPattern {
    // Function to print the number pattern
    public void numberTrianglePattern(int N) {
        // Outer loop to handle rows
        for (int i = 1; i <= N; i++) {
            // Inner loop to handle columns for each row
            for (int j = 1; j <= i; j++) {
                // Print a star followed by a space
                System.out.print(j + " ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NumberPattern sol = new NumberPattern();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.numberTrianglePattern(N);
        sc.close();
    }
}
