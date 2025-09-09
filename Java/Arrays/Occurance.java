package Java.Arrays;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
          int arr[] = new int[]{2, 3 , 1 , 5 , 55 , 77 ,44};

         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
            
         if(x>=0){
            System.out.println(x + " = " + arr[x]);
         }else{
            System.out.println("invalid number");
         }
    }
}