package Java.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];


        System.out.println("Enter the Elements of the array : ");

        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum : ");
        int target = sc.nextInt();

        int left = 0; 
        int right =size-1;

        while(left<right){
            int sum = arr[left]+arr[right];

            if(sum == target){
                System.out.println("The two numbers are : "+(left+1)+" "+(right+1));
                return;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("pair not found");
    }
}
