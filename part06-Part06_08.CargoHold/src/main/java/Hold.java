
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */
public class Hold {
    private int maxweight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxweight) {
        this.maxweight = maxweight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maxweight>=totalWeight()+suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for (int i=0; i<this.suitcases.size(); i++) {
            sum += this.suitcases.get(i).totalWeight();
        }
        return sum;
    }
    
    public String toString() {
        if (this.suitcases.size()==0) {
            return "no suitcases (0 kg)";
        } else if (this.suitcases.size()==1) {
            return this.suitcases.size() + " suitcase (" + totalWeight() + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (int i=0; i<this.suitcases.size(); i++) {
                this.suitcases.get(i).printItems();
        }
    }
}
