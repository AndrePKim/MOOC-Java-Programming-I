import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics points = new Statistics();
        
        System.out.println("Enter point total, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point==-1) {
                break;
            }
            points.add(point);
        }
        System.out.println("Point average (all): " + points.average());
        System.out.println("Point average (passing): " + points.averagepass());
        System.out.println("Pass percentage: " + points.passpercent());
        System.out.println("Grade distribution:");
        points.gradedist();
    }
}
