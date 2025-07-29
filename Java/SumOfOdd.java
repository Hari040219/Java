package Java;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int  n = sc.nextInt();
        SumOfAllOddNumber(n);
        
    }

    public static void SumOfAllOddNumber(int n){
     int sum=0;
     for(int i=1;i<n;i++){
        if(i%2!=0){
            sum = sum+i;
           
        }
     }
      System.out.println("The sum of odd number is :"+sum);

    }
    
}
