package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFrequencyElement {
    //Time Complexity: O(N*N), where N = size of the array. We are using the nested loop to find the frequency.
    //Space Complexity: O(N), where N = size of the array. It is for the visited array we are using.
    public static void maxMinFreqCount(int[] arr,int length){
        int minFreq=length, maxFreq=0;
        int minElement=0, maxElement=0;

         // If element already processed, skip
        boolean visited[]=new boolean[length];
        for(int i=0;i<length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for (int j = i+1; j < length; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            // Update max frequency and corresponding element
            if(count>maxFreq){
                maxFreq=count;
                maxElement=arr[i];
            }
            // Update min frequency and corresponding element
            if(count<minFreq){
                minFreq=count;
                minElement=arr[i];
            }
        }
        // Print final results
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }

    //Optimal Aproach
    //Time Complexity: O(N), where N = size of the array. The insertion and retrieval operation in the map takes O(1) time.
    //Space Complexity: O(N), where N = size of the array. It is for the map we are using.
    public static void maxMinFreqCountUsingHashMap(int[] arr,int length){
        int minFreq=length, maxFreq=0;
        int minElement=0, maxElement=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxElement=entry.getKey();
            }else if(entry.getValue()<minFreq){
                minFreq=entry.getValue();
                minElement=entry.getKey();
            }

        }
        // Print final results
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
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
        maxMinFreqCount(arr, n);
        maxMinFreqCountUsingHashMap(arr, n);
    }
    
}