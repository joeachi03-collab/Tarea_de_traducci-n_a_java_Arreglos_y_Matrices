
package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
 
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion donde se encuentra el mayor: " + posMayor);
        System.out.println("Posicion donde se encuentra el menor: " + posMenor);
 
        
    }
}