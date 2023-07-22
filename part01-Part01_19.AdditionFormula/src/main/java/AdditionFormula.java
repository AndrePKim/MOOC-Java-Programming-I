
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        String first = scanner.nextLine();
        int firstint = Integer.valueOf(first);
        
        System.out.println("Give the second number:");
        String second = scanner.nextLine();
        int secondint = Integer.valueOf(second);
        
        System.out.println(first + " + " + second + " = " + (firstint+secondint));
    }
}
