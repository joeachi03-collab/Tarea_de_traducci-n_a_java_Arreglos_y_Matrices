/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglos_y_matrices;

import java.util.Scanner;

/**
 *
 * @author Joe Mateo Achi Arteaga
 */
public class Ejercicio9 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese un numero para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
 
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
 
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
 
        sc.close();
    }
}