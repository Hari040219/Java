package Java;

import java.util.Scanner;

public class Multiplication {
    public Multiplication() {
   }

   public static int MultiplicationOfTwoNumbers(int a, int b) {
      int product = a * b;
      return product;
    
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number:");
      int a = sc.nextInt();
      System.out.print("Enter the second number");
      int b = sc.nextInt();
      int ans = MultiplicationOfTwoNumbers(a, b);
      System.out.println("The answer is : " + ans);
     
      sc.close();
   }
}
