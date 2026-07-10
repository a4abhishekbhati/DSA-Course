package BasicMath;
import java.util.Scanner;


public class CountDigit {
    //Time Complexity: O(log10N + 1), where N is the input number.
    // Function to count the number of digits in an integer 'n'.
    public static int countDigits(int n) {
        // Initialize a counter variable
        int cnt = 0;
        while (n > 0) {
            // Increment the counter
            cnt = cnt + 1;
            // Divide 'n' by 10 to remove the last digit.
            n = n / 10;
        }
        // Return the count of digits.
        return cnt;
    }

    // Time Complexity: O(1)
    // public static int countDigits(int n) {
    //     return (int)Math.log10(n)+1;
    // }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int N=sc.nextInt();
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
