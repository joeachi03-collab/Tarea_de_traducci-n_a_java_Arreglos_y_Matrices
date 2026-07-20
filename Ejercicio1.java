

package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero para la posicion " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Valores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }   
    }
}
    
