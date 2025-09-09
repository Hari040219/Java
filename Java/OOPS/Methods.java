package Java.OOPS;

class Animals{
    String name;
    int age;
    String breed;
    void walk(){
        System.out.println("Usually animals have 4 legs");
    }
}

public class Methods {
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.walk();
    }
}
