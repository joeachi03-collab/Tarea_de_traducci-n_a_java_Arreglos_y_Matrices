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
public class Ejercicio6 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 3;
        int columnas = 4;
        int i ;
        int j ;
        int[][] matriz = new int[filas][columnas];
 
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("Matriz ingresada:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
  

