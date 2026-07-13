package Recursion;

import java.util.Scanner;

public class StringPallindrome {
    // public static boolean checkPallindrome(String str) {
    //     int s=0;
    //     int e=str.length()-1;
    //     while(s<e){
    //         // Skip non-alphanumeric characters on the left side
    //         if(!Character.isLetterOrDigit(str.charAt(s)))
    //             s++;
    //         // Skip non-alphanumeric characters on the right side
    //         else if(!Character.isLetterOrDigit(str.charAt(e)))
    //             e--;
    //         // If characters are different, it's not a palindrome
    //         else if(str.charAt(s)!=str.charAt(e))
    //             return false;
    //         else{
    //         // Move towards the middle if characters are the same
    //             s++;
    //             e--;
    //         }
    //     }
    //     return true;
    // }

    // Function to check if a string is a palindrome using recursion
    public static boolean palindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;
        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        // If both characters are the same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String:- ");
        String str=sc.next();
        // System.out.println(checkPallindrome(str));
        System.out.println(palindrome(0,str));
    }
    
}
