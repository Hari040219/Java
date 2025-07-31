package Java;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number maga");
        int  n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while(n>0){
            int digit = n%10;
             reverse = reverse*10+digit;
             n = n/10;
        }

        if(original==reverse){
            System.out.println("Congagulations brother it is a Palindrome Number");
        }
        else{
            System.out.println("It is not a palindrome number maga");
        }
        
    }

}
