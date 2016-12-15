package org.fasttrackit.util.agenda;

import org.fasttrackit.util.Calc;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Agenda {

    public static void main(String[] args) {

        String[] agenda = new String[10];
        int index = 0;
        int option;
        do {
            System.out.println("1-Create");
            System.out.print("2-UpdateByName\n");
            System.out.print("3-DeleteByName | 4 - searchByName |");
            System.out.println(" 5 - printAll");
            System.out.println("9 - Exit");

            option = Calc.readIntFromConsole();

            if(option == 1) {
                System.out.println("Give me a name:");
                String newName = Calc.readStringFromConsole();
                agenda[index] = newName;
                index++;
            }
            if(option == 5) {
                System.out.println("All names from agenda:");
                for(int i = 0; i < index ; i++) {
                    System.out.println(agenda[i]);
                }
            }

        } while(option != 9);

    }

}
