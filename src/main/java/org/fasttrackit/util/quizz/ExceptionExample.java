package org.fasttrackit.util.quizz;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 22/12/2016.
 */
public class ExceptionExample {

    public static void main(String[] args) {



        try {
            int[] sir = new int[3];
            sir[2] = 5;
            System.out.println("Am adaugat valoarea 4");
//            Object o = null;
//            o.toString();
            exceptionTHrower();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vezi ca nu mai avem elemente!");
        } catch (NullPointerException e) {
            System.out.println("This was a null pointer execption");
        } catch (TextException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is always executed");
        }
    }

    public static void exceptionTHrower() throws TextException {
        throw new TextException("ai apelat pe cine nu trebe");
    }
}
