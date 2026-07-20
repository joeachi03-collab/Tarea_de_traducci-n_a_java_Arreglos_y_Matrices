
package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio2 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio ;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero real: " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }
        promedio = suma / 10 ;
        System.out.println("suma total:" + suma);
        System.out.println("promedio:" + promedio);
    }
     
}

