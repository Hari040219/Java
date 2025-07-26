package Java;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number broii");
        int n = sc.nextInt();
        PrimeNUmberOrNot(n);



        
    }

    public static void PrimeNUmberOrNot(int n){
    for(int i=2;i<=n;i++){

        if(n%i==0){
            System.out.println("It is not a prime number");
            return;
        }
       
    }
    System.out.println(n+"It is a prime number");
    
}
}