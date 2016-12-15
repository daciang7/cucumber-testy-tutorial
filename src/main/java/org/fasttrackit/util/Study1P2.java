package org.fasttrackit.util;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Study1P2 {



    public static void sub3 () {
            //Sum them until you read a number that can be divided by 5. Print the resulting sum.
            int a;
            int sum = 0;
            do {
                System.out.println("Give me a number:");
                a = Calc.readIntFromConsole();
                sum += a;
            } while (a % 5 != 0);
            System.out.println("The sum is " + sum);
        }

    public static void sub2() {
        //Count how many you read until you read an even number
        int a;
        int count = 0;
        do {
            System.out.println("Give me a number:");
            a = Calc.readIntFromConsole();
            count++;
        } while (a % 2 != 0);
        System.out.println("Just read " + count + " numbers!");
    }

    public static void main(String[] args) {
        sub1();
        sub2();
        sub3();
    }
    /*
    Read numbers from the keyboard and
        Print the on the screen until you read an odd number
     */
    public static void sub1() {
        int a;
        do {
            System.out.println("Give me a number:");
            a = Calc.readIntFromConsole();
            System.out.println(a);
        } while (a % 2 == 0);
    }

}
