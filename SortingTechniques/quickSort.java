package SortingTechniques;

import java.util.Scanner;

public class quickSort {
    //Time Complexity: O(N*logN), At each step, we divide the whole array, for that we take logN time and n steps are taken for the partitioning. In worst case i.e. when our pivot is always the greatest or the smallest element of the array, the time complexity can be O(N^2).
    //Space Complexity: O(N), auxiliary stack space.
    public static void quickSort(int []arr,int low,int high) {
        // Base case
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(arr, low, high);
            // Sort left subarray
            quickSort(arr, low, pivotIndex - 1);
            // Sort right subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    // Function to partition array
    private static int partition(int[] arr, int low, int high) {
        // Choose last element as pivot
        int pivot = arr[high];

        // Initialize i
        int i = low - 1;

        // Traverse from low to high-1
        for (int j = low; j < high; j++) {
            // If element <= pivot
            if (arr[j] <= pivot) {
                // Increment i and swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
    // private static int partition(int[] arr, int low, int high) {
    //     // Choose last element as pivot
    //     int pivot = arr[low];
    //     // Initialize i
    //     int i=low, j=high;
    //     while(i<j){
    //         while(arr[i]<=pivot&&i<high){
    //             i++;
    //         }
    //         while(arr[j]>pivot&&j>low){
    //             j--;
    //         }
    //         if(i<j){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    //     int temp2=arr[j];
    //     arr[j]=arr[low];
    //     arr[low]=temp2;
    //     return j;
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
