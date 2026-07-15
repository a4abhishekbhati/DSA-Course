package Hashing;

import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //precompute---Counting the occuerences of each number & suppose max element of array is 12
        //length of has array will be max ----> number+1 
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the total number of query you wanna ask");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter the query number");
            int number=sc.nextInt();
            //fetch from hash array
            System.out.println(number +  "--->" + hash[number]);
            q--;
        }
        //the total time complexity will be O(5*N). If the number of queries is Q, the time complexity will be O(Q*N). 
        
    }
}
