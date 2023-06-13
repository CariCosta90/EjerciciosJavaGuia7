/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entero por teclado");
        int num = leer.nextInt();

        //float doble = mostrarDoble(num);
        //float triple = mostrarTriple(num);
        //double raiz = mostrarRaiz(num);
        System.out.println("El numero ingresado fue: " + num);
        System.out.println("El doble es: " + mostrarDoble(num));
        System.out.println("El triple es: " + mostrarTriple(num));
        System.out.println("La raiz cuadrada es: " + mostrarRaiz(num));
        
    }
    
    public static float mostrarDoble(int num) {
        
        float doble = num * 2;
        return doble;
        
    }
    
    public static float mostrarTriple(int num) {
        
        float triple = num * 3;
        return triple;
        
    }
    
    public static double mostrarRaiz(int num) {
        double raiz = Math.sqrt(num);
        return raiz;
    }
}
