package Java;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        TablesOfaNumber(n);
    }
    

    public static  void TablesOfaNumber(int n){
        int i =1;
       while(i<=10){
        int table = n*i; 
        System.out.println(n+"*"+i+"="+table);
        i++;
       }
    }
}
