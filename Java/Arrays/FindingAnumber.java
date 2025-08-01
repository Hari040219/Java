package Java.Arrays;

import java.util.Scanner;

public class FindingAnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please eneter the size of the array : ");
        int size = sc.nextInt();
       

        int arr[] = new int[size];
        System.out.println("Please enter the elements of the array : ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Please enter the element u want to search : ");
        int n = sc.nextInt();

        for(int i =0;i<size;i++){
          if(arr[i]==n){
            System.out.println("Element found at index "+i);
          }
        }
            


    }
    
}
