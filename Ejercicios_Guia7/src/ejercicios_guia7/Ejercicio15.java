/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        int[] vector = new int[100];
        int contador = 100;
        for (int i = 0; i < 100; i++) {
            vector[i] = contador;
            contador--;
            System.out.print("[" + vector[i] + "]");
        }
    }
}
