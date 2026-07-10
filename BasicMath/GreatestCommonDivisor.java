import java.util.Scanner;

public class GreatestCommonDivisor {
    // public static int findGcd(int n1,int n2){
    //     int gcd=1;
    //     for(int i=1;i<Math.min(n1,n2);i++){
    //         if(n1%i==0 && n2%i==0){
    //             gcd=i;
    //         }
    //     }
    //     return gcd;
    // }
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b)
                a = a % b;
            else
                b = b % a;
        }
        if(a==0)
            return b;
        return a;
    }                   

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number1:- ");
        int num1=sc.nextInt();
        System.out.print("Enter a Number2:- ");
        int num2=sc.nextInt();
        System.out.println("GCD of "+num1+ " and "+num2+" is "+ findGcd(num1, num2));
    }
    
}
