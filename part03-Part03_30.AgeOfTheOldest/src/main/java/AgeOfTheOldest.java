
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int old = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1])>old) {
                old = Integer.valueOf(parts[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + old);


    }
}
