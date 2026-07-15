package SortingTechniques;

import java.util.Scanner;

public class SelectionSort {
    //Time Complexity:O(N^2),Selection sort runs in O(N²) time in the best, average, and worst cases due to its nested loop structure. It makes approximately N(N-1)/2 comparisons, regardless of the array's initial state. Even if no swaps are needed (best case), the number of comparisons remains the same./p>
    //Space Complexity: O(1). No extra space used
    public static void selectionSort(int []arr,int n){
        for (int i = 0; i < n-1; i++) {
            int minEleIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minEleIndex]){
                    minEleIndex=j;
                }
            }
            // Swap the found minimum element with the first element of unsorted part
            int temp = arr[minEleIndex];
            arr[minEleIndex] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr,n);

    }
    
}
