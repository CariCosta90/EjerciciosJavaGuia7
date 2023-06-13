
package ejercicios_guia7;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("Escribe dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = sumar(num1, num2);
        
        System.out.println("La suma de los numeros ingresados es: "+ suma );
    }
    
    public static int sumar(int num1, int num2){
        System.out.println(" ");
        
        int suma = num1+num2;
        return suma;
    }
    
}
