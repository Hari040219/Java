package Java.Arrays;

import java.util.Scanner;

public class SecondMinAndSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
         
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<size;i++){
            arr[i]  = sc.nextInt();
        }
        int max= 0;
        int SecondMax =0;

        int min= arr[size-1];
        int SecondMin =arr[size-1];
        for(int i = 0;i<size;i++){
            int num = arr[i];

            if(num>max){
                SecondMax = max;
                max = num;
            }else if(num > SecondMax && num != max){
                SecondMax = num;
            }

            if(num<min){
                SecondMin = min;
                min = num;
            }else if(num < SecondMin && num != min){
                SecondMin = num;
            }
        }

        System.out.println(SecondMax);
        System.out.println(SecondMin);

 
    }
}
