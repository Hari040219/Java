package Java;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number broii");
        int n = sc.nextInt();
        PrimeNumOrNot(n);
       



        
    }

     static void PrimeNumOrNot(int n){

        int a = 2;
        for(int i=2;i<=n;i++){
            if(a%2!=0){
                System.out.println("It is not a  prime number broii sorry");
                return;
              
            }
        }
        System.out.print("Congagulations Brother it is a prime number ");
     }
}