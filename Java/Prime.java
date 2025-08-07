package Java;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number broii: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Broo, " + n + " is not a prime number ");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Yessss it's a PRIME number broii ");
        } else {
            System.out.println("It is NOT a prime number broii ");
        }
    }
}
