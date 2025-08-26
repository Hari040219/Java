package Java.Strings;

import java.util.Scanner;

public class Sliceat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String result = "";

        for(int i =0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                result=result+email.charAt(i);
            }
        }
        System.out.println(result);
    }
}