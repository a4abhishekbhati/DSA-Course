package Pattern.Easy;

import java.util.Scanner;

public class InvertedPyramid {
    // Function to print InvertedPyramid pattern of stars
    public void invertedPyramid(int N) {
        
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < i ; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < 2*(N-i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InvertedPyramid sol = new InvertedPyramid();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.invertedPyramid(N); // Call the function to print the pattern
        sc.close();
    }
}


