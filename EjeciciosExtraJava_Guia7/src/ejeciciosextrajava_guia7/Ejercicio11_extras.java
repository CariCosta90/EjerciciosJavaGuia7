/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */

import java.util.Scanner;

public class Ejercicio11_extras {
        public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
            System.out.println("Ingresa un numero para evaluar");
            int num = leer.nextInt();
            
           int cont = 0;
           
           while(num>0){
               num = num/10;
               cont++;
           }
           
           System.out.println("La cantidad de digitos es de: " + cont);            
    }
}
