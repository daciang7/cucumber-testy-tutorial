package org.fasttrackit.util.quizz;

/**
 * @author flo
 * @since 22/12/2016.
 */
public abstract class Vehicle {

    public abstract String honk();

    public void moves() {
        System.out.println("Vehicle Moves");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        Car c = new Car();

//        v.moves();
        c.moves();
        System.out.println(c.honk());
    }
}

class Car extends Vehicle {

    public String honk() {
        this.moves();
        super.moves();
        return "Tiiiitt";
    }

    @Override
    public void moves() {
        System.out.println("Car moves");
        super.moves();
    }
}
