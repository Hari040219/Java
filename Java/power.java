package Java;
import java.util.Scanner;

public class power{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the base number :");
        int x = sc.nextInt();
        System.out.print("Please enter the power : ");
        int n = sc.nextInt();
        ToThePower(n, x);
        
    }

    public static void ToThePower(int n , int x){
        int result = 1;
        for(int i =0;i<n;i++){
            result = result*x;
            
        }
        
        System.out.println(result);
    }

    }
