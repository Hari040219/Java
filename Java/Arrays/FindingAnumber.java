package Java.Arrays;

import java.util.Scanner;

public class FindingAnumber {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter how many number u want to enter : ");
    int n = sc.nextInt();

    int arr [] = new int[n];


    System.out.print("Ok enter your numbers : ");
    for(int i =0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    
    System.out.print("Please enter the number which u want to find out : ");
    int a = sc.nextInt();
    
    for(int i=0;i<n;i++){
      if(a==arr[i]){
        System.out.print(" Your number is present in " + arr[i] +" index");
        break;
        
      }
      else{
        System.out.print("correct agi check maadu guru");
        break;
      }
      
    }

            


    }
    
}
