
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int length = 0;
        int count = 0;
        String longest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            count++;
            String[] parts = input.split(",");
            if (parts[0].length()>length) {
                longest = parts[0];
                length = parts[0].length();
            }
            sum += Integer.valueOf(parts[1]);
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double)sum/count);


    }
}
