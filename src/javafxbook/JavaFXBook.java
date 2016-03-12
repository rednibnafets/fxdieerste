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
public class JavaFXBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person hamish = new Person("Hamish", "MacDuff", Person.Gender.MALE);
        Person emhildur = new Person("Emhildur", "Antonsdottir", Person.Gender.FEMALE);
        
        System.out.println(hamish);
        System.out.println(emhildur);
        
        
        
        
    }
    
}
