package Java.OOPS;

class Hari{
    private String name;
    private int age;

    void setName(String name ){
        this.name = name;
    }

    String getName(){
        return this.name ;
    }

    void setAge(int age){
         this.age = age;
    }

    int getAge(){
        return age;
    }
       
    


}

public class GettersSetters {
    public static void main(String[] args) {
        Hari hari  = new Hari();

        hari.setName("HariPrasad");
        hari.setAge(22);
        System.out.println(hari.getAge());
        System.out.println(hari.getName());


    }
}
