
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i=0; number<100+1; i++) {
            System.out.println(number);
            number++;
        }

    }
}
