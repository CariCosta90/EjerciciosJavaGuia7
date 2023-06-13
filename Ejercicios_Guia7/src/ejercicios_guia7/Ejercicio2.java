
package ejercicios_guia7;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
         String nombre;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa tu nombre: ");
         nombre = leer.next();
         System.out.println("Tu nombre es: " + nombre);
    }
    
}
