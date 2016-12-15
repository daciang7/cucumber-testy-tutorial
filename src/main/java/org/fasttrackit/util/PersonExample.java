package org.fasttrackit.util;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class PersonExample {
    public static void main(String[] args) {
        new Idea();
        Person person = new Person("ion");
        person.setGender('M');
        Person person2 = new Person("maria","marinescu");

        System.out.println(person.talk() + "|" + person.getLastName() + "|"  + person.getGender());
        System.out.println(person2.talk() + "|" + person2.getLastName());

        System.out.println(person.talk());
    }
}
