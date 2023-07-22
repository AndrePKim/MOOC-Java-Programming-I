
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String code = scanner.nextLine();
            if (code.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            Archive item = new Archive(code,name);
            
            if (items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }
        }
        
        System.out.println("==Items==");
        for (Archive item : items) {
            System.out.println(item);
        }

    }
}
