package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    //Time Complexity: O(N²), as for every element we may scan the remaining elements in the array.
    //Space Complexity: O(N), for the visited array of size N.
    // Function to count frequency of each element in the array
    public static void countFreq(int[] arr, int n) {
        // Create a visited array to mark elements that are already processed
        boolean[] visited = new boolean[n];
        // Traverse through all elements of the array
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i])
                continue;

            // Count the frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark arr[j] as processed
                    count++;
                }
            }

            // Output the element and its count
            System.out.println(arr[i] + " ---> " + count);
        }
    }

    //Optimal Approach
    //Time Complexity: O(N), where N is the number of elements in the array. Each element is processed once.
    //Space Complexity: O(N), for storing frequencies of unique elements in the unordered_map.
    public static void frequencyCount(int[] arr,int length){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < length; i++) {
            //map.getOrDefault(arr[i], 0)---It acts as an "if-else" statement packed into a single line
            //If the key exists: It returns the actual value associated with that key (just like standard .get()).
            //If the key does NOT exist: Instead of returning null, it returns a backup default value that you specify.
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        // Traverse through the HashMap and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
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
        // frequencyCount(arr,n);
        countFreq(arr, n);
        
    }
    
}
