
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
        if (age>=18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are not an adult");
        }
    }
}
