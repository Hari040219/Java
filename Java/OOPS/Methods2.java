package Java.OOPS;

class Animal{
    String name;
    String breed;
    int age;

    void walk(String talk){
        System.out.println(talk);
    }
}

public class Methods2 {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name="Rocky";
        dog.breed="Beedhi naayi";
        dog.walk("Animals usually have 4 legs");
    }
}
