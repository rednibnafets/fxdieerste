package javafxbook;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
//import java.util.HashSet;
//import java.util.Set;

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
       
        
        // add a PropertyChangeListener
        final PropertyChangeListener pcl = new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent event){
                System.out.println("Property " + event.getPropertyName()
                        + " changed for " + event.getSource() + "!") ;
            }
        
        }; // ! 
        
        hamish.addPropertyChangeListener(pcl);
        emhildur.addPropertyChangeListener(pcl);
        
        System.out.println(hamish);
        System.out.println(emhildur);
        
        hamish.setTitle(Person.Title.MASTER);
        emhildur.setTitle(Person.Title.MS) ;
        
        
               
        
        
    }
    
}
