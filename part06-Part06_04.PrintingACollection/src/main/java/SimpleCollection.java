
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String collection = "";
        int count = 0;
        
        for (int i=0; i<this.elements.size(); i++) {
            if (i==0) {
                collection = collection + this.elements.get(i);
                count++;
                continue;
            } else if (i==1) {
                collection = collection + "\n" + this.elements.get(i) + "\n";
                count++;
                continue;
            }
            collection = collection + this.elements.get(i) + "\n";
            count++;
        }
        
        if (count==1) {
            return "The collection " + this.name + " has " + count + " element:\n" + collection;
        }
        
        return "The collection " + this.name + " has " + count + " elements:\n" + collection; 
    }
    
}
