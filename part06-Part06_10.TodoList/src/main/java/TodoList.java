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
public class TodoList {
    private ArrayList<String> items;
    
    public TodoList() {
        this.items = new ArrayList<>();
    }
    
    public void add(String task) {
        this.items.add(task);
    }
    
    public void print() {
        for (int i=0; i<this.items.size(); i++) {
            System.out.println((i+1) + ": " + this.items.get(i));
        }
    }
    
    public void remove(int number) {
        this.items.remove(number-1);
    }
}
