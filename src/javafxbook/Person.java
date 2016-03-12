/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbook;

import java.io.Serializable;

/**
 *
 * @author stefan
 */
public final class Person implements Serializable {

    private String firstname;
    private String lastname;

    public enum Gender {
        MALE, FEMALE, UNKNOWN
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
        this.firstname = firstname;
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
        this.lastname = lastname;
    }

}
