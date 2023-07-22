/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */
public class Book {
    private String title;
    private String page;
    private String year;
    
    public Book(String title, String page, String year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getPage() {
        return this.page;
    }
    
    public String getYear() {
        return this.year;
    }
    
    public String toString() {
        return this.title + ", " + this.page + " pages, " + this.year;
    }
}
