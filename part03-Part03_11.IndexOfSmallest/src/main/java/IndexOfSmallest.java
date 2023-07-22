
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number==9999) {
                break;
            }
            list.add(number);
        }
        
        int small = 9999;
        int count = 0;
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        for (int i=0; i<list.size(); i++) {
            if (list.get(i)<small) {
                small = list.get(i);
                count = i;
            }
        }
        System.out.println("Smallest number: " + small);
        System.out.println("Found at index: " + count);

        
    }
}
