package org.fasttrackit.util.agenda;

import org.fasttrackit.util.Calc;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Agenda {

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("1-Create");
            System.out.print("2-UpdateByName\n");
            System.out.print("3-DeleteByName | 4 - searchByName |");
            System.out.println(" 5 - printAll");
            System.out.println("9 - Exit");
            option = Calc.readIntFromConsole();

        } while(option != 9);

    }

}
