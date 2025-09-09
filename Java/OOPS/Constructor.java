package Java.OOPS;

class Gaand {
    String name;
    int age;

    Gaand(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Display() {
        System.out.println("Name is : " + this.name + ", Age is : " + this.age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Gaand gaandu = new Gaand("Hari", 22);
        gaandu.Display();
    }
}
