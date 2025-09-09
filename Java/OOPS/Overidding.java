package Java.OOPS;

class Thu{
    int Add(int a,int b){
        return a+b;
    }
}

class OverActing extends Thu{
    int Add(int a , int b){
        return a+b+1;
    }
}

public class Overidding {
    public static void main(String[] args) {
        Thu hari = new Thu();
        System.out.println(hari.Add(5,6));
    }
}
