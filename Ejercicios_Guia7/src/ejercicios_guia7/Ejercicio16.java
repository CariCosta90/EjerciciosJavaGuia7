/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        int n;
        int num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el largo del vector");

        n = leer.nextInt();

        int[] vector = new int[n];
        System.out.println("El vector generado es ");
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Ingrese el numero que quiere buscar");
        num = leer.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El numero " + num + " fue encontrado en la posicion " + i + " del vector");
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("El numero no fue encontrado");
        } else if (contador > 1) {
            System.out.println("El valor se encontraba repetido " + contador + " veces");
        } else {
            System.out.println("El valor se encontro una unica vez");
        }

    }

}
