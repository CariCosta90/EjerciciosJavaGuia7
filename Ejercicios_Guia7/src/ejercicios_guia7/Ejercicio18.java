/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */

import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // declaracion de una matriz en Java
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        System.out.println("La matriz A es: ");
        
        //este for crea la matriz A con valores random
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j]=(int) (Math.random() * 10);
                System.out.print("["+matrizA[i][j]+"]");
            }
            System.out.println("");
        }
        
        //este otro for crea la matriz B transponiendo los valores de la matriz A
         System.out.println("La matriz B es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
                System.out.print("["+matrizB[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
