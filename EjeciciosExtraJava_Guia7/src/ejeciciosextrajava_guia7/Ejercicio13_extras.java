/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
import java.util.Scanner;

public class Ejercicio13_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de escalones que quieres visualizar");

        int escalones = leer.nextInt();

        String concatenacion = "1";

        System.out.println(concatenacion);
        //inicioj en 2 porque el 1 esta por fuera del for para la primer impresion en la que no se concatena con nada
        for (int i = 2; i <= escalones; i++) {
            //uso el String.valueOf(i) para poder convertir el int i a string y asi concatenarlo a la cadena que voy guardando y mostrando en cada vuelta
            concatenacion = concatenacion + String.valueOf(i);
            System.out.println(concatenacion);
        }

    }

}
