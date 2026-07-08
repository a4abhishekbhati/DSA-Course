package Pattern.Easy;

import java.util.Scanner;

public class Pyramid {
    // Function to print pyramid pattern of stars
    public void pyramid(int N) {
        
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pyramid sol = new Pyramid();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.pyramid(N); // Call the function to print the pattern
        sc.close();
    }
}


