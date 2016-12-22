package org.fasttrackit.util.quizz;

/**
 * @author flo
 * @since 22/12/2016.
 */
public class Vehicle {

    public void moves() {
        System.out.println("Vehicle Moves");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();

        v.moves();
        c.moves();
    }
}

class Car extends Vehicle {

}
