
package ejercicios_guia7;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en grados centigrados");
        int centigrados = leer.nextInt();
        
        int retorno = calcularFarenheit(centigrados);
        System.out.println("El valor ingrsado en Cº: " + centigrados + " Y la conversion a Fº es: " + retorno);
    }
    
    public static int calcularFarenheit(int centigrados){
        int convertido = 32 + (9*centigrados/5);
        return convertido;
    }
}
