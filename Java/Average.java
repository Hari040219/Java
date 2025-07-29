package Java;

import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        System.out.print("Enter the third number");
        int c = sc.nextInt();
        AverageOfThreeNumbers(a, b, c);
        

}


public static void AverageOfThreeNumbers(int a,int b, int c){
    int result = (a+b+c)/3;
    System.out.println(result);
}

    
}

