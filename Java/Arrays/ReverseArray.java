package Java.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];


        System.out.print("Enter the elements of array : ");
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = size - 1;
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("The reversed Array is : ");
        for(int i =0;i<size;i++){
            System.out.print( arr[i]);
        }

    }
}
