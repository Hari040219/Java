package Java;

import java.util.Scanner;

public class GreatestOfThree {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int c = sc.nextInt();

        if(a>b&&a>c){
            System.out.println("First number is the greatest of all : " + a);
        }else if(b>a&&b>c){
            System.out.println("Second number is the greatest of all : " + b);
        }
        else if(c>b&&c>a){
                System.out.println("Third number is the Greatest of all : " + c);
        }
    }
}