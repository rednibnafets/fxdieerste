/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbook;

/**
 *
 * @author stefan
 */
public class Book {

    public static Book create(String t) {
        return new Book(t);
    }
    
    private String title;
    
    private Book(String t){
        title = t ;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
