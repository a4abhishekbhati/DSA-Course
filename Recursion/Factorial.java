package Recursion;

import java.util.Scanner;

public class Factorial {
    //Aproach 1:- Brute force Using Linear traversal & calculate the factorial og a number.

    // Time Complexity: O(N), Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N)
    //Space Complexity: O(N), In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space.
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }
    
}
