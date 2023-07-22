
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
public class Suitcase {
    private int maxweight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
    }
    
    public int totalWeight() {
        int sum = 0;
        for (int i=0; i<this.items.size(); i++) {
            sum += this.items.get(i).getWeight();
        }
        return sum;
    }
    
    public void addItem(Item item) {
        if (this.maxweight>=totalWeight()+item.getWeight()) {
            this.items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.size()==0) {
            return "no items (0 kg)";
        } else if (this.items.size()==1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        String obj = "";
        
        for (int i=0; i<this.items.size(); i++) {
            if (i==0) {
                obj = obj + this.items.get(i);
                continue;
            } else if (i==1) {
                obj = obj + "\n" + this.items.get(i) + "\n";
                continue;
            } else if (i==this.items.size()-1) {
                obj = obj + this.items.get(i);
                continue;
            }
            obj = obj + this.items.get(i) + "\n";
        }
        
        System.out.println(obj);
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int heavy = 0;
        int num = 0;
        for (int i=0; i<this.items.size(); i++) {
            if (heavy<this.items.get(i).getWeight()) {
                heavy = this.items.get(i).getWeight();
                num = i;
            }
        }
        return this.items.get(num);
    }
}
