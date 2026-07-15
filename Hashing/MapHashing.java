package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MapHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //The total time complexity will be O(N * time taken by map data structure).
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key=arr[i];
            int freq=0;
            if(map.containsKey(key))
                freq=map.get(key);
            freq++;
            map.put(key, freq);
        }

        System.out.println("Enter the total number of query you wanna ask");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter the query number");
            int number=sc.nextInt();
            if(map.containsKey(number))
                System.out.println(number +  "--->" +  map.get(number));
            else
                System.out.println(number +  "--->" +  0 );
            q--;
        }
    }
    
}
