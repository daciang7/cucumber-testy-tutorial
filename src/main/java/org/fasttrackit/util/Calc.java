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
        int min, max;
        if(x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }
        int sum = max;
        System.out.println("Starting with " + sum);
        for(int i = 0; i < min; i++) {
            System.out.print("Adding 1 to sum " + sum);
            sum = sum + 1;
            System.out.println(" becomes " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Sum is: " + calc.tatiCatFace(40000000, 10));
    }
}
