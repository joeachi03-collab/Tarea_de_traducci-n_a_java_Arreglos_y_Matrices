
package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero positivo " + i + ": ");
            int valorIngresado = sc.nextInt();
            numeros[i] = valorIngresado + i;
        }
 
        System.out.println("\nArreglo resultante:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
 