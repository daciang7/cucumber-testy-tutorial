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
        if(y == 0) {
            return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.tatiCatFace(4, 5));
    }
}
