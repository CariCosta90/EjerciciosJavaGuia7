/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */

import java.util.Scanner;
public class Ejercicio1_extras {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;
        int dias;
        int horas;
        
        
        System.out.println("Ingresa el valor en minutos");
        minutos = leer.nextInt();
        
        dias = Math.abs(minutos/1440);
        horas = (minutos % 1440)/60;
        System.out.println("el resultado es: " + dias + " dia/s y " + horas + " hora/s " );
        
        
    }
    
}
