package org.fasttrackit.util;

/**
 * @author flo
 * @since 08/12/2016.
 */
public class Example {
    public static void main(String[] a) {
        System.out.println("main body");

        Calc calc = new Calc();
        int sum = calc.add(2, 8);
        System.out.println("Sum is:" + sum);
    }

}
