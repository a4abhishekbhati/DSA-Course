package Hashing;

import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:-");
        String str=sc.next();
        
        //Code if the string contains only lowercase:
        //precompute---Counting the occuerences of each Character 
        //length of has array will be max ----> 26(no of alphabet)
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            // int index=str.charAt(i)-'a';
            // hash[index]++;
            //      or
            hash[str.charAt(i)-'a']++;
        }
        System.out.println("Enter the total number of query you wanna ask");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter the query Character");
            char ch=sc.next().charAt(0);   //Taking the string as input & fetch the character from string
            //fetch from hash array
            System.out.println(ch +  "--->" + hash[ch-'a']);
            q--;
        }
    }
    
    
}
