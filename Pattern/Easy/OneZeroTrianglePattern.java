package Pattern.Easy;

import java.util.Scanner;

public class OneZeroTrianglePattern {
    // Function to print 0 1 Triangle Pattern
    public void oneZeroTrianglePattern(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                // Print a star followed by a space
                if((i+j)%2==0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OneZeroTrianglePattern sol = new OneZeroTrianglePattern();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.oneZeroTrianglePattern(N);
        sc.close();
    }
}
