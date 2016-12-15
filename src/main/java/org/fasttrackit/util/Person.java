package org.fasttrackit.util;

import org.fasttrackit.onlinelibrary.view.LoginView;
import org.fasttrackit.onlinelibrary.view.*;

import java.util.Date;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Person {
    private static int noOfPerson;
    public static int getNoOfPerson() {
        new LoginView();
        new TopMenuNavigationView();
        return noOfPerson;
    }

    // state
    private String firstName;
    private String lastName;
    private char gender;
    private Date dateOfBirth;

    public Person(String firstName) {
        this.firstName = firstName;
        this.lastName = "Pop";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //behavior
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Idea think() {
        // do the thinking
        return new Idea();
    }

    private String verbalise(Idea idea) {
        return firstName + idea.toString();
    }

    public String talk() {
        Idea idea = think();
        return verbalise(idea) + noOfPerson;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
