package Java.Arrays;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter how many number u want to enter : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

          System.out.print("Please enter your numbers : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
      
        for(int i =0;i<n;i++){
            
            System.out.print(" "+arr[i] +);
        }

    }
}
