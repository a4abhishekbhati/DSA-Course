package SortingTechniques;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[],int low,int mid,int high) {
        // Create temp array
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        // Merge both sorted parts
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);
        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
        
    }
     // Recursive merge sort
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        // Find mid index
        int mid = (low + high) / 2;
        // Sort left half
        mergeSort(arr, low, mid);
        // Sort right half
        mergeSort(arr, mid + 1, high);
        // Merge both halves
        merge(arr, low, mid, high);
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
        mergeSort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
