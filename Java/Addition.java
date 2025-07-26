package Java;

import java.util.Scanner;

public class Addition {
    public static int AdditionOfNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = AdditionOfNumbers(a, b);
        System.out.println("The sum is: " + result);
        
        sc.close(); // Always good to close the scanner!
    }
}

