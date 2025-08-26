package Java.Strings;

import java.util.Scanner;

public class ReplaceEwithI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String with the letter 'e' in it : ");
        String original  = sc.nextLine();

        String result = original.replace('e', 'i').replace('E', 'I');
        

        System.out.println(result);
        
    }
}
