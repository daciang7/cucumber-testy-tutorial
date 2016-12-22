package org.fasttrackit.util.quizz;

/**
 * @author flo
 * @since 22/12/2016.
 */
public class DisplayOverloading {
    public static void main(String[] args) {
        disp(1);
    }

    private static void disp(int i) {
        System.out.println(i);
    }

    private static int disp(int i, int j) {
        System.out.println(i + j);
        return 5;
    }
}
