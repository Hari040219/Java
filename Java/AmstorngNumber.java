package Java;

import java.util.Scanner;

public class AmstorngNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number broii : ");
        int n = sc.nextInt();

        int result =0;
        int  sum = 0;

        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
            for(int i=0;i<n;i++){
                result = result*i;
            }
            
        }
        System.out.println(sum);
        System.out.println(result);
    }
    
}
