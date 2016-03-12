package javafxbook;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author stefan
 */
public final class Person implements Serializable {

    private String firstname;
    private String lastname;
    private Person.Title title;

    private PropertyChangeSupport pcs = null;

    // add bound properties 
    public static final String PERSON_FIRSTNAME = "firstname";
    public static final String PERSON_LASTNAME = "lastname";
    public static final String PERSON_TITLE = "title";    

    // make sure that the object is fully constructed
    // BEFORE passing t the PropertyChangeSupport ctor
    // - use in SETTERs (getters unchanged)
    private PropertyChangeSupport getPropertyChangeSupport() {
        if (this.pcs == null) {
            this.pcs = new PropertyChangeSupport(this);
        }
        return this.pcs;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChangeSupport().addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChangeSupport().removePropertyChangeListener(listener);
    }

    /**
     * @return the title
     */
    public Person.Title getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Person.Title title) {
        Person.Title oldTitle = this.title ;
        this.title = title;
        getPropertyChangeSupport().firePropertyChange(
                PERSON_TITLE, oldTitle, firstname);        
        
    }

    public enum Gender {
        MALE, FEMALE, UNKNOWN
    }
    
    public enum Title{
        MS, MRS, MR, MASTER
    }

    public Person() {
        this("", "", Gender.UNKNOWN);
    }

    public Person(String fname, String lname, Person.Gender gender) {
        this.firstname = fname;
        this.lastname = lname;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (!firstname.isEmpty()) {
            s.append(firstname);
        }
        if (!lastname.isEmpty()) {
            s.append(" ").append(lastname);
        }
        return s.toString();
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        getPropertyChangeSupport().firePropertyChange(
                PERSON_FIRSTNAME, oldFirstname, firstname);
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        String oldLastname = this.lastname ;
        this.lastname = lastname;
        getPropertyChangeSupport().firePropertyChange(
                PERSON_LASTNAME, oldLastname, lastname);
    }

}
