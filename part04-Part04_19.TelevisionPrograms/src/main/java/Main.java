import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram (name,duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        if (max>0) {
            for (int i=0; i<programs.size(); i++) {
                if (programs.get(i).getDuration()<=max) {
                    System.out.println(programs.get(i));
                }
            }
        }

    }
}
