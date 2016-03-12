package javafxbook;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
// PropertyChangeListener is an interface.
// see
// http://docs.oracle.com/javase/7/docs/api/java/beans/PropertyChangeListener.html
//
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
        // (!) ... anonymous inner class creation can be turned into a lambda expression
//        final PropertyChangeListener pcl = new PropertyChangeListener(){
//            @Override
//            public void propertyChange(PropertyChangeEvent event){
//                System.out.println("Property " + event.getPropertyName()
//                        + " changed for " + event.getSource() + "!") ;
//            }
//        
//        }; // ! 
//
// use a lambda expression 
// the compiler infers that this expression defines the methor propertyChange()
// - see documentation!
//
        final PropertyChangeListener pcl = (PropertyChangeEvent event) -> {
                System.out.println("Property " + event.getPropertyName()
                        + " changed for " + event.getSource() + "!") ;
        };

        
        hamish.addPropertyChangeListener(pcl);
        emhildur.addPropertyChangeListener(pcl);
        
        System.out.println(hamish);
        System.out.println(emhildur);
        
        hamish.setTitle(Person.Title.MASTER);
        emhildur.setTitle(Person.Title.MS) ;
        
        
        Book firstbook = Book.create("Ulysses") ;
        System.out.println("Title of firstbook: " + firstbook.getTitle());
        
        
    }
    
}
