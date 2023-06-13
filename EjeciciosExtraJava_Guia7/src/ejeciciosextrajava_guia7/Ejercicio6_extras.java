/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
import java.util.Scanner;

public class Ejercicio6_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        double altura;
        double sumaDealturas=0;
        //int promedio;
        
        
        System.out.println("Ingresa la cantidad de personas a evaluar");
        n = leer.nextInt();
        
        for (int i = 1; i <= n ; i++) {
            System.out.println("Ingresa la altura de la persona " + i);
            altura = leer.nextDouble();
            sumaDealturas = sumaDealturas + altura;
        }        
        System.out.println("El promedio de todas las alturas es de: " + sumaDealturas/n);        
    }

}
