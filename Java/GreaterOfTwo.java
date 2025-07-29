package Java;

import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your first number : ");
      int a = sc.nextInt();
      System.out.print("Enter your second number : ");
      int b = sc.nextInt();
      System.out.println(GreaterOfTwoNumbers(a, b));

    }

    static int GreaterOfTwoNumbers(int a , int b){
        if(a>b){
            System.out.print("The greater number is : ");
            return a;
             
        }
        else{
            System.out.print("The Greater number is : ");
            return b;
        }
    }
}
