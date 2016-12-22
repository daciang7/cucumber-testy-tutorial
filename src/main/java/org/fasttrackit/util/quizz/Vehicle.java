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

    @Override
    public int hashCode() {
        return 1;
    }

    public static void main(String[] args) {
        Vehicle v = new Car(3);
        Car c = new Car(3);
        Car b = new Car(4);
        System.out.println(c.toString());
        System.out.println(c == v);
        System.out.println(c.equals(v));
        System.out.println(c.equals(b));
        System.out.println(c.equals("cucurigu"));


//        v.moves();
        c.moves();
        System.out.println(c.honk());
    }
}

class Car extends Vehicle {

    private int id;

    public Car(int id) {
        this.id = id;
    }

    public String honk() {
        this.moves();
        super.moves();
        return "Tiiiitt";
    }

    @Override
    public boolean equals(Object other) {
        if(! (other instanceof Car)) {
           return false;
        }
        Car car = (Car)other;
        return car.id == this.id;
    }

    @Override
    public void moves() {
        System.out.println("Car moves");
        super.moves();
    }
}
