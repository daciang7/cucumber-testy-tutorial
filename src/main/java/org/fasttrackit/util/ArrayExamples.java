package org.fasttrackit.util;

/**
 * @author flo
 * @since 08/12/2016.
 */
public class ArrayExamples {

    public static void main(String[] args) {
        int[] intArr = new int[4];
        intArr[3] = 123;
        int intArr2[] = {1, 2, 3};
        int [][] matrix = new int[3][4];
        matrix[2][2] = 2;

        int[] arrayInt = {11, 1, 15, 3, 7, 9, 11, 13};
        int[] squares = new int[arrayInt.length];
        for( int i = 0; i < arrayInt.length; i++) {
            squares[i] = arrayInt[i] * arrayInt[i];
        }
        for(int square : squares) {
            System.out.println(square);
        }

        //separate parity
        int[] par = new int[arrayInt.length];
        int countPar = 0, countImpar = 0;
        int[] impar = new int[arrayInt.length];
        for(int i = 0; i< arrayInt.length ; i++) {
            if(arrayInt[i] % 2 == 0) {
                //add pare
                par[countPar] = arrayInt[i];
                countPar++;
            } else {
                //add impare
                impar[countImpar] = arrayInt[i];
                countImpar++;
            }
        }
        // print pare
        System.out.println("Counter par" + countPar);
        for(int i = 0 ; i< countPar; i++) {
            System.out.print(par[i] + ",");
        }
        System.out.println("");
        // print impare
        for(int i = 0; i< countImpar ; i ++) {
            System.out.print(impar[i] + ",");
        }
    }
}
