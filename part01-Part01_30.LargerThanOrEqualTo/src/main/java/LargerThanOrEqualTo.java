
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        String first = scanner.nextLine();
        int firstint = Integer.valueOf(first);
        System.out.println("Give the second number:");
        String second = scanner.nextLine();
        int secondint = Integer.valueOf(second);
        
        if (firstint>secondint) {
            System.out.println("Greater number is: " + first);
        } else if (firstint<secondint) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The numbers are equal");
        }

    }
}
