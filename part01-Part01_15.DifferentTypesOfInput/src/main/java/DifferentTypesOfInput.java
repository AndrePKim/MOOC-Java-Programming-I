
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int in = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double dou = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + in);
        System.out.println("You gave the double " + dou);
        System.out.println("You gave the boolean " + boo);

    }
}
