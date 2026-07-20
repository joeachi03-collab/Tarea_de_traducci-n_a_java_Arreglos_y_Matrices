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
public class Ejercicio8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        int sumaDiagonal = 0;
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + i + " columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < filas; i++) {
            System.out.println(matriz[i][i]);
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }
 
        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
 
    }
}
