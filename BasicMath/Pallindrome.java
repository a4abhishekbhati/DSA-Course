import java.util.Scanner;

public class Pallindrome {
    public static int reverseNumber(int n) {
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        // Return the reversed number
        return revNum;
    }
    public static void checkPallindrome(int n){
        int temp=n;
        int result=reverseNumber(n);
        if(result==temp)
            System.out.println(temp + " is pallindrome");
        else
            System.out.println(temp + " is not a pallindrome");        
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        checkPallindrome(num);
    }
    
}
