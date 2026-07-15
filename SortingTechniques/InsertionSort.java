package SortingTechniques;

import java.util.Scanner;

public class InsertionSort {
    //Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
    //Space Complexity: O(1).
    public static void insertionSort(int []arr,int n){
        for (int i = 1; i < n; i++) {
            boolean didswap=false;
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                    didswap=true;
                }
                if(!didswap)
                    break;  
            }
        }
        printArray(arr);

    }

    //using for & while loop
    public static int[] insertionSortMethod(int []nums,int n) {
        for (int i = 1; i < n; i++) {
            int key = nums[i]; // Current element as key 
            int j = i;
            
            // Shift elements that are greater than key by one position
            while (j > 0 && nums[j-1] > key) {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = key; // Insert key at correct position
        }
        return nums;
    }

    public static void printArray(int []arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // insertionSort(arr,n);
        arr=insertionSortMethod(arr, n);
        printArray(arr);
    }
    
}
