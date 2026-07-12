import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDivisor {
    // public static List<Integer> findAllDivisor(int n){
    //     List<Integer> list=new ArrayList<>();
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0){
    //             list.add(i);
    //         }
    //     }
    //     return list;
    // }

    public static List<Integer> findAllDivisor(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        List<Integer> result = findAllDivisor(num);

        // Print the result
        System.out.print("Divisors of " + num + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }    
}
