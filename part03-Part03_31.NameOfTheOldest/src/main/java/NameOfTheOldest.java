
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int old = 0;
        String oldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1])>old) {
                old = Integer.valueOf(parts[1]);
                oldest = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldest);

    }
}
