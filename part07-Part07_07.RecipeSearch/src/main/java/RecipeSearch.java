import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read:");
        String file = scanner.nextLine();
        int count = 0;
        
        ArrayList<String> allrecipe = new ArrayList<>();
        ArrayList<String> temprecipe = new ArrayList<>();
        ArrayList<Recipes> recipe = new ArrayList<>();
        ArrayList<Integer> cooktime = new ArrayList<>();
        
        try (Scanner fileread = new Scanner(Paths.get(file))) {
            while (fileread.hasNextLine()) {
                allrecipe.add(fileread.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for (int i=0; i<allrecipe.size(); i++) {
            temprecipe.add(allrecipe.get(i));
            if (allrecipe.get(i).equals("") || i==allrecipe.size()-1) {
                String recipename = temprecipe.get(0);
                temprecipe.remove(0);
                recipe.add(new Recipes(recipename));
                cooktime.add(Integer.valueOf(temprecipe.get(0)));
                temprecipe.remove(0);
                recipe.get(count).equalIngredient(temprecipe);
                count++;
                temprecipe.clear();
                continue;
            }
        }
        
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n" 
                + "find name - searches recipes by name\n" 
                + "find cooking time - seraches recipes by cooking time\n" 
                + "find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (int i=0; i<recipe.size(); i++) {
                    System.out.println(recipe.get(i).getName() + ", cooking time: " + cooktime.get(i));
                }
                System.out.println("");
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchword = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (int i=0; i<recipe.size(); i++) {
                    if (recipe.get(i).getName().contains(searchword)) {
                        System.out.println(recipe.get(i).getName() + ", cooking time: " + cooktime.get(i));
                    }
                }
                System.out.println("");
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int searchtime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (int i=0; i<recipe.size(); i++) {
                    if (cooktime.get(i)<=searchtime) {
                        System.out.println(recipe.get(i).getName() + ", cooking time: " + cooktime.get(i));
                    }
                }
                System.out.println("");
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String searchingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (int i=0; i<recipe.size(); i++) {
                    if (recipe.get(i).getIngredient().contains(searchingredient)) {
                        System.out.println(recipe.get(i).getName() + ", cooking time: " + cooktime.get(i));
                    }
                }
                System.out.println("");
            } else {
                System.out.println("Unknown command");
            }
        }
        

    }

}
