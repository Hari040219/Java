package Java.OOPS;

class Ayoo{
    String name;
    int age;

    void nkn(String name){
        this.name=name;
        
    }
    void nkn(int age){
        System.out.println(this.age);
    }

    void nkn(String name ,int age){
        System.out.println(name + age);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Ayoo hari = new Ayoo();
        hari.name="Hari";
        hari.age=22;
        hari.nkn("hari" , 22);
    }
}
