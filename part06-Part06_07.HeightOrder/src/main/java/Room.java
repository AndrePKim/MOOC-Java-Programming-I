
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
public class Room {
    
    private ArrayList<Person> person = new ArrayList<>();
    
    public Room() {
        this.person = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.person.add(person);
    }
    
    public boolean isEmpty() {
        if (this.person.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.person;
    }
    
    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }
        
        int index = 0;
        int obj = 999;
        
        for (int i=0; i<this.person.size(); i++) {
            if (obj>this.person.get(i).getHeight()){
                obj = this.person.get(i).getHeight();
                index = i;
            }
        }
        
        return this.person.get(index);
    }
    
    public Person take() {
        if (this.person.isEmpty()) {
            return null;
        }
        ArrayList<Person> fill = new ArrayList<>();
        fill.add(shortest());
        this.person.remove(shortest());
        return fill.get(0);
    }
}
