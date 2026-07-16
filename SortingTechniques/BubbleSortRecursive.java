package SortingTechniques;

import java.util.Scanner;

public class BubbleSortRecursive {
    //Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
    //Space Complexity: O(N) auxiliary stack space.
    public static void bubbleSort(int []arr,int n){
        if(n==1){
            return;
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;                     
            }  
        }
        bubbleSort(arr, n-1);
    }
    
    //Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
    //Space Complexity: O(N) auxiliary stack space.
    public static void bubbleSortOptimised(int[] arr, int n) {
        // Base case
        if (n == 1) return;
        boolean didSwap = false; // Track if any swap occurred
        // Perform one pass of bubble sort
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }

        // If no swaps were made, the array is already sorted
        if (!didSwap) return;

        // Recur for remaining elements
        bubbleSort(arr, n - 1);
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
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
