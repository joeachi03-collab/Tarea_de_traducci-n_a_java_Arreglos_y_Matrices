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
public class Ejercicio10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese el numero para la fila " + i + " columna " + j + ": ");
                int valorIngresado = sc.nextInt();
                matriz[i - 1][j - 1] = valorIngresado + (i * j);
            }
        }
 
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
 

    }
}