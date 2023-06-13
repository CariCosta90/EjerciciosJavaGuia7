/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
import java.util.Scanner;

public class Ejercicio19_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean iguales=true;

        System.out.println("Ingresa el largo de los vectores");

        int largo = leer.nextInt();

        int[] vector1 = new int[largo];
        int[] vector2 = new int[largo];

        //popular los vectores
        for (int i = 0; i < largo; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }

        //mostrar los vecotres
        System.out.println("vector 1");
        for (int i = 0; i < largo; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        
        System.out.println("");
        System.out.println("vector 2");

        for (int i = 0; i < largo; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
        
        //comparamos los vectores
        for (int i = 0; i < largo; i++) {
            if (vector1[i]==vector2[i]) {
                iguales=true;
            }else{
                iguales=false;
                break;
            }
        }
        
        System.out.println("Los vectores son iguales? " + iguales);
    }
}
