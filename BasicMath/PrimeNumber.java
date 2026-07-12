import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int n){
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(i!=n/i){
                    c++;
                }
            }
        }
        return c>2?false:true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
    }    
}
