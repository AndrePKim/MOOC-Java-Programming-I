
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> birdname = new ArrayList<>();
        ArrayList<String> birdlatin = new ArrayList<>();
        ArrayList<Integer> observation = new ArrayList<>();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.println("Name:");
                birdname.add(scan.nextLine());
                System.out.println("Name in Latin:");
                birdlatin.add(scan.nextLine());
                observation.add(0);
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                if (!(birdname.contains(bird))) {
                    System.out.println("Not a bird!");
                    continue;
                }
                for (int i=0; i<birdname.size(); i++) {
                    if (birdname.get(i).equals(bird)) {
                        observation.set(i, observation.get(i)+1);
                    }
                }
            } else if (command.equals("All")) {
                for (int i=0; i<birdname.size(); i++) {
                    System.out.println(birdname.get(i) + " (" + birdlatin.get(i) + "): " + observation.get(i) + " observations");
                }
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                for (int i=0; i<birdname.size(); i++) {
                    if (birdname.get(i).equals(bird)) {
                        System.out.println(birdname.get(i) + " (" + birdlatin.get(i) + "): " + observation.get(i) + " observations");
                    }
                }
            } else {
                System.out.println("Unknown command");
            }
        }

    }

}
