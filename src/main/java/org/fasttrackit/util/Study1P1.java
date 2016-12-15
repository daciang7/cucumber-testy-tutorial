package org.fasttrackit.util;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Study1P1 {
    public static void main(String[] args) {
        int n = Calc.readIntFromConsole();
        for(int i = 0; i<= n; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }

        int i = 0;
        while(i <= n) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
