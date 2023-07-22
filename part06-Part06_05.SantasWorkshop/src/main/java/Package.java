
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
public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        
        int total = 0;
        
        for (int i=0; i<this.gifts.size(); i++) {
            total += this.gifts.get(i).getWeight();
        }
        
        return total;
    }
}
