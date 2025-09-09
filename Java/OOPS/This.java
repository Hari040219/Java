package Java.OOPS;

class Student{
    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    void Display(){
        System.out.println("Name : " + this.name +","+ "Age : " + this.age);
    }
}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student("hari", 22);
            s1.Display();
        
    }
}
