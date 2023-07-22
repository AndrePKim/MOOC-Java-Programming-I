import java.util.ArrayList;

public class Recipes {
    private String name;
    private ArrayList<String> ingredient;
    
    public Recipes(String name) {
        this.name = name;
        this.ingredient = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public ArrayList<String> getIngredient() {
        return this.ingredient;
    }
    
    public void addIngredient(String ingredient){
        this.ingredient.add(ingredient);
    }
    
    public void equalIngredient(ArrayList<String> ingredient){
        for (int i=0; i<ingredient.size(); i++) {
            this.ingredient.add(ingredient.get(i));
        }
    }
}
