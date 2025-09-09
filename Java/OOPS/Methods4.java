package Java.OOPS;


class People{
    String name;
    int age;

    void Speak(){
        System.out.println( name + " : " +"FULL PSYCH BROOO");
    }
}

public class Methods4 {
    public static void main(String[] args) {
        People hari = new  People();
         People prasad = new  People();

        hari.name = "Hari";
        hari.age = 22;

        prasad.name =  "Prasad";
        prasad.age = 20;

        prasad.Speak();
        hari.Speak();

        
    }
}
