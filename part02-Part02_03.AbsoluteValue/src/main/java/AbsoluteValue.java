
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = Integer.valueOf(reader.nextLine());
        
        if (number<0) {
            number = number*-1;
            System.out.println(number);
        } else {
            System.out.println(number);
        }

    }
}
