package Java.Strings;

import java.util.Scanner;

public class Repalceewithi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        String result ="";

        for(int i=0;i<original.length();i++){
            char ch = original.charAt(i);

            if(ch=='e'){
                result=result+'i';
            }else{
                result=result+ch;
            }

        }

        System.out.println(original);
        System.out.println(result);
    }
}
