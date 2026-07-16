package SortingTechniques;

import java.util.Scanner;

public class InsertionSortRecursive {
    public static void insertionSort(int []arr,int i,int n) {
        if(i==n){
            return;
        }
        int j=i;
        while(j>0&&arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertionSort(arr, i+1, n);
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
        insertionSort(arr, 0, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
