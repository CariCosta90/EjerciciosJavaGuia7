/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
import java.util.Scanner;

public class Ejercicio3_extras {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingresa una letra para identificar si es vocal");
        letra = leer.next();
        
        while (letra.length()>1){
            System.out.println("El valor ingresado no es valido, por favor ingresa una unica letra");
            letra = leer.next();
        }
        
        evaluarLetra(letra);
        
    }
    
    public static void evaluarLetra(String letra){
        
        letra = letra.toLowerCase();
        
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("La letra ingresada es una vocal");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");
        }
        
    }
    
}
