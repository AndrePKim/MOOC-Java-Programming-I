
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add") && parts.length==2) {
                first.add(Integer.valueOf(parts[1]));
            } else if (input.contains("move") && parts.length==2 && parts[0].equals("move")) {
                if (Integer.valueOf(parts[1])>first.contains()) {
                    second.add(first.contains());
                    first.remove(Integer.valueOf(parts[1]));
                    continue;
                }
                first.remove(Integer.valueOf(parts[1]));
                second.add(Integer.valueOf(parts[1]));
            } else if (input.contains("remove") && parts.length==2) {
                second.remove(Integer.valueOf(parts[1]));
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
