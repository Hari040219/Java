package Java;
import java.util.Scanner;
public class RadiusToCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        double pi = 3.14;
        double circumference = 2*pi*r;
        System.out.print("The circumferece of the circle is : "+circumference);
        
    }

    
}
