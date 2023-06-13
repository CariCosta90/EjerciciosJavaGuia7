/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
import java.util.Scanner;

public class Ejercicio7_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        int contador = 0;
        int num;
        int min = 0;
        int max = 0;
        int promedio = 0;

        System.out.println("Introduce la cantidad de numeros");
        n = leer.nextInt();

        System.out.println("version do-while");
        do {
            System.out.println("Ingresa un numero");
            num = leer.nextInt();

            if (contador == 0) {
                min = num;
            }

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            promedio = promedio + num;

            contador++;

        } while (contador < n);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Promedio: " + promedio / n);

        System.out.println("version while");
        System.out.println("Introduce la cantidad de numeros");
        n = leer.nextInt();
        contador=0;
        promedio=0;

        while (contador < n) {
            System.out.println("Ingresa un numero");
            num = leer.nextInt();
            if (contador == 0) {
                min = num;
            }

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

            promedio = promedio + num;

            contador++;
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Promedio: " + promedio / n);

    }

}
