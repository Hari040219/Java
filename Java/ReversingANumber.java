package Java;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number broo : ");
        int n = sc.nextInt();

            Reverse(n);
        
    }
    

    public static void Reverse(int n ){
        int original = n;
        int reverse = 0;

        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n = n/10;
        }
        System.out.print(reverse);
       
    }
}
