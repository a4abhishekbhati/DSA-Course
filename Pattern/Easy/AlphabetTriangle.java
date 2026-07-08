package Pattern.Easy;

import java.util.Scanner;

public class AlphabetTriangle {
    // Function to print alphabet Triangle Pattern
    public void alphabetTrianglePattern(int N) {
        // Outer loop to handle rows
        for (int i = 0; i < N; i++) {
            //Inner loop to hadle the alphabet
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");  // Print the character followed by a space
            }
            // After printing stars in a row, move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AlphabetTriangle sol = new AlphabetTriangle();
        System.out.print("Enter the Number:- ");
        int N = sc.nextInt(); // take the input from user 
        sol.alphabetTrianglePattern(N);
        sc.close();
    }
    
}
