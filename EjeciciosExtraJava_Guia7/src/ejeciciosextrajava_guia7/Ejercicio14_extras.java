/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */


import java.util.Scanner;

public class Ejercicio14_extras {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        
        int familias;
        int hijos;
        int edad;
        int sumaEdades;
        
        System.out.println("Ingresa la cantidad de familias");
        familias = leer.nextInt();
        
        for (int i = 1; i <= familias; i++) {
            sumaEdades=0;
            System.out.println("Ingresa la cantidad de hijos en la familia " + i);
            hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingresa la edad del hijo " + j + " de la familia " + i);
                edad = leer.nextInt();
                sumaEdades = sumaEdades+edad;
            }
            System.out.println("El promedio de la edad de los hijos de la familia " + i + " es de " + sumaEdades/hijos);
        }
        
        
    }
}
