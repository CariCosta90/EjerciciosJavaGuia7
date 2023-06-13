/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */

import java.util.Scanner;

public class Ejercicio18_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros que tendra el vector");
        int n = leer.nextInt();        
        int vector[] = new int[n];
        int suma=0;
        
        //popular vector
        System.out.println("Ingresa los valores del vector");       
        
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            
        }
        
        //mostrar vector
        System.out.println("El vector ingresado es: ");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("");
        
        //sumar los valores de vector        
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }
                
        System.out.println("La suma de los numeros del vector es: " + suma);
    }
    
}
