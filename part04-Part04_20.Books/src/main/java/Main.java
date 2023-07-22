import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> series = new ArrayList<>();
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            String page = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
            series.add(new Book(title,page,year));
        }
        
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();
        
        for (int i=0; i<series.size(); i++) {
            if (answer.equals("everything")) {
                System.out.println(series.get(i));
            } else if (answer.equals("name")) {
                System.out.println(series.get(i).getTitle());
            } else if (answer.equals("page")) {
                System.out.println(series.get(i).getPage());
            } else if (answer.equals("year")) {
                System.out.println(series.get(i).getYear());
            }
        }

    }
}
