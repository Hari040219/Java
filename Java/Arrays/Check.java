package Java.Arrays;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array : ");
      int n = sc.nextInt();

      int []arr = new int[n];

      System.out.println("Please enter a sorted array : ");

      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }


      boolean isSorted = true;

      for(int i=1;i<n;i++){
        if(arr[i]<arr[i-1]){
             isSorted = false;
            break;

       
      }
    }

        if (isSorted) {
            System.out.println("Array is sorted in Ascending order broo.");
        }else {
            System.out.println("U fuckin idiot didn't I tell u enter a sorted array.");
        }

          sc.close();
    
    }
}

