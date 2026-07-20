
package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
 
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }
 
        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}
