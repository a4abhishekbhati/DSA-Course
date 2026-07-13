package Recursion;

import java.util.Scanner;

public class ReverseOfArray {
    //Brute Force Aproach 1:- create a new array and start placing the original array's elements from the back into the front of the new array.
    // Time Complexity: O(n) Each element is visited once in a loop, where n is the number of elements in the input array.
    // Space Complexity: O(n) An additional array of the same size is used to store the reversed elements.

    //Better Appraoch
    // Time Complexity: O(n) Where n is the number of elements in the array. Each element is visited at most once due to the two-pointer approach.
    // Space Complexity: O(1) No extra space is used other than a few pointers and variables. The array is reversed in-place.
    public static void reverseArray(int[] arr,int l){
        // Initialize pointer to the beginning of the array
        int p1 = 0;
        // Initialize pointer to the end of the array
        int p2 = l - 1;
        // Loop until the two pointers meet in the middle
        while (p1 < p2) {
            // Swap the elements at p1 and p2
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            // Move the left pointer one step to the right
            p1++;
            // Move the right pointer one step to the left
            p2--;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a array Size:- ");
        int num=sc.nextInt();
        System.out.print("Enter a array Element:- ");
        int []arr1=new int[num];
        for (int i = 0; i < num; i++) {
            arr1[i]=sc.nextInt();
        }
        reverseArray(arr1,num);
        for(int ele:arr1){
            System.out.print(ele + " ");
        }
    }
    
}
