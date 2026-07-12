import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length(); // Get number of digits
        int sum = 0;
        int n = num;
        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, k);      // Add ld^k
            n /= 10;                     // Remove digit
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }
    
}
