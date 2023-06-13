/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
import java.util.Scanner;

public class Ejercicio16_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre;
        int edad;
        String confirmacion;

        do {

            System.out.println("Ingresa el nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingresa la edad de la persona");
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }

            System.out.println("Quieres ingresar otra persona? si/no");
            confirmacion = leer.next();

        } while (!confirmacion.equals("no"));

        System.out.println("Has finalizado el programa");
    }
}
