package Java.OOPS;

class Human{
    String model = "Lady";
    void walk(){
        System.out.println("All Humans can walk ");
    }
    
}

class Elephant extends Human{
    String brand = "Hari 2.O";
    void talk(){
        System.out.println("All humans can Talk ");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.walk();
        elephant.talk();
        System.out.println(elephant.model+" "+elephant.brand );
    }
}
