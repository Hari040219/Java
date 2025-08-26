package Java.Strings;
import java.util.*;

public class Cumulative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of Strings you want to enter : ");
        int size = sc.nextInt();
        sc.nextLine();


        String arr[] = new String[size];

        System.out.println("Enter your Strings : ");
        for(int i=0;i<size;i++){
           arr[i] =sc.nextLine();
        }

        int total_length = 0;
        for(int i =0;i<size;i++){
            total_length = total_length+arr[i].length();
        }
        System.out.println(total_length);
    }
}