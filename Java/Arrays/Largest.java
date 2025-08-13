package Java.Arrays;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Elements of Array : ");
        for(int i =0;i<size;i++){
            arr [i] = sc.nextInt();
        }

        
        int largest = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest ){
                largest = arr[i];
            }
            
                
            
        }
        System.out.println("The largest element in the array is : "+largest);
    }
}
