package Java.Arrays;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size = sc.nextInt();

    int arr [] = new int[size];
    
    System.out.print("Enter the array Elements");
    for(int i=0;i<size;i++){
       arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int count = 1;

    for(int i=1;i<size;i++){
        if(arr[i]==arr[i-1]){
            count++;
        }else{
            System.out.println("The number" +arr[i-1]+ "occurs" + count + "times");
            count = 1;
        }
    }
    System.out.println("the number"+ arr[size-1]+ "occurs"+ count + "times");
    }
}
