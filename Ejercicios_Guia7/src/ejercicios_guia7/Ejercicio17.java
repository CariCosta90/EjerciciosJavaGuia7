/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
import java.util.Scanner;
//este import random me permite generar un numero aleatorio entre 1 y el valor deseado
import java.util.Random;

public class Ejercicio17 {

    public static void main(String[] args) {
        int n;

        Scanner leer = new Scanner(System.in);
        //se crea una variable igual que con Scanner
        Random rand = new Random();

        System.out.println("Ingresa el largo del vector");
        n = leer.nextInt();
        //declaramos el vector con el largo n ingresado por teclado
        int[] vector = new int[n];
        //popular el vector con numeros random 
        System.out.println("El vector generado es: ");
        for (int i = 0; i < n; i++) {
            // Al usar nextInt(10000), generamos un número aleatorio entre 0 y 9999. Para obtener un número en el rango deseado (1-10000), sumamos 1 al resultado. 
            vector[i] = rand.nextInt(10000) + 1;
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        int num;
        for (int i = 0; i < n; i++) {
            int contador = 0;
            num = vector[i];
            if (num == 0) {
                contador = 1;
            } else {
                while (num > 0) {
                    num = num / 10;
                    contador++;
                }
            }
            System.out.println("El numero " + vector[i] + " tiene " + contador + " digitos");
        }
    }
}
