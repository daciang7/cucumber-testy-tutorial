package org.fasttrackit.util;

/**
 * @author flo
 * @since 08/12/2016.
 */
public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int tatiCatFace(int x, int y) {
        int sum = x;
        System.out.println("Starting with " + sum);
        while(y != 0) {
            System.out.print("Adding 1 to sum " + sum);
            sum = sum + 1;
            System.out.println(" becomes " + sum);
            y = y - 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Sum is: " + calc.tatiCatFace(4, 5));
    }
}
