
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add") && parts.length==2) {
                if (Integer.valueOf(parts[1])<0) {
                    continue;
                } else if (first+Integer.valueOf(parts[1])>=100) {
                    first = 100;
                    continue;
                }
                first += Integer.valueOf(parts[1]);
            } else if (input.contains("move") && parts.length==2 && parts[0].equals("move")) {
                if (Integer.valueOf(parts[1])<0){
                    continue;
                } else if (Integer.valueOf(parts[1])>=first) {
                    if (second+first>=100) {
                        first = 0;
                        second = 100;
                    }
                    second += first;
                    first = 0;
                } else {
                    second += Integer.valueOf(parts[1]);
                    first -= Integer.valueOf(parts[1]);
                }
                if (second >= 100) {
                    second = 100;
                }
            } else if (input.contains("remove") && parts.length==2) {
                if (Integer.valueOf(parts[1])<0){
                    continue;
                } else if (Integer.valueOf(parts[1])>=second) {
                    second = 0;
                    continue;
                }
                second -= Integer.valueOf(parts[1]);
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
