package Pattern.Hard;

import java.util.Scanner;

import Pattern.Easy.AlphabetTriangle;

public class ConcentricNumberPattern {
    public void concentricNumberPattern(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < 2*N-1; i++) {
            //Inner loop 
            for (int j = 0; j < 2*N-1; j++) {
                // Calculate distance from top
                int top = i;
                // Calculate distance from left
                int left = j;
                // Calculate distance from bottom
                int bottom = (2 * N - 2) - i;
                // Calculate distance from right
                int right = (2 * N - 2) - j;

                // Take the minimum of all four distances
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print number (starts with n at border, decreases inside)
                System.out.print((N - minDist) + " ");
                
            }
            //move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ConcentricNumberPattern sol = new ConcentricNumberPattern();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.concentricNumberPattern(N);
        sc.close();
    }
    
}
