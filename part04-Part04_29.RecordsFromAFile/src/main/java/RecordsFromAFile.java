
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        
        try (Scanner fileread = new Scanner(Paths.get(filename))) {
            while (fileread.hasNextLine()) {
                String line = fileread.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int year = Integer.valueOf(parts[1]);
                System.out.println(name + ", age: " + year + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
