package Java;

import java.util.Scanner;

public class Factorial {

    public static void Factorial(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
           
        }
        System.out.println(factorial);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        Factorial(n);
    }    
}
