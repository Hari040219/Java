package Java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        SumOfNDigits(n);
        
    }
    
    static void SumOfNDigits(int n){
        int sum = 0;

        while(n>0){
            int digit = n%10;
             sum = sum+digit;
             n = n/10;
        }
        System.out.println(sum);
    }
}
