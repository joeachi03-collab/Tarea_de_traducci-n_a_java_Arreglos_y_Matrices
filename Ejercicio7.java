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
public class Ejercicio7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        int sumaTotal = 0;
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese un numero:");
                matriz[i][j] = sc.nextInt();
                sumaTotal = sumaTotal + matriz[i][j];
            }
        }
 
        System.out.println("Suma total de todos los elementos: " + sumaTotal);
 
        sc.close();
    }
}
 
