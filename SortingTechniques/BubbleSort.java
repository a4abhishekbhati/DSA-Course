package SortingTechniques;

import java.util.Scanner;

public class BubbleSort {
    //Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
    //Space Complexity: O(1).
    public static void bubbleSort(int []arr,int n){
        for (int i = 0; i < n-1; i++) {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }  
            }
        }
        printArray(arr);

    }

    //Time Complexity:O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
    //Space Complexity:O(1)
    public static void bubbleSortOptimise(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Track if any swapping happens in this pass
        
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                    swapped = true; // A swap occurred
                }  
            }
        
            // If no two elements were swapped in the inner loop, the array is already sorted!
            if (!swapped) {
                break; 
            }
        }
        printArray(arr);
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
        // bubbleSort(arr,n);
        bubbleSortOptimise(arr, n);

    }
}
