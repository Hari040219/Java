package Java.Arrays;

import java.util.Scanner;

public class RotatingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] =  new int[size];

        System.out.println("Please enter the elements of the array : ");
        for(int i=0;i<size;i++){
        
          arr[i] = sc.nextInt();
        }

        System.out.println("enter k(rotation steps) : ");
        int k = sc.nextInt();
        k %=size;

        rotate(arr,0,size-1);
        rotate(arr,0,k-1);
        rotate(arr,k,size-1);


        System.out.println("Rotated array is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
          
        static void rotate(int arr[] , int start , int end){
            while(start<end){
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }

        }
    }

