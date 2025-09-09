package Java.OOPS;

class Addittion{
    void AdditonOfTwoNumbers(int a , int b  ){
        int sum = a+b;
        System.out.println(sum);
    }
}


public class Method3 {
    public static void main(String[] args) {
        Addittion add = new Addittion();
        add.AdditonOfTwoNumbers(2 , 3 );
    }
}
