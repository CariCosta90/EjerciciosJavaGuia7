/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
import java.util.Scanner;

public class Ejercicio15_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //pedir dos numeros
        int num1;
        int num2;

        System.out.println("Ingresa el primer numero");
        num1 = leer.nextInt();

        System.out.println("Ingresa el segundo numero");
        num2 = leer.nextInt();

        //seleccionar la operacion
        System.out.println("Selecciona la operacion que quieres realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        int operacion = leer.nextInt();

        switch (operacion) {
            case 1:
                suma(num1, num2);
                break;
            case 2:
                resta(num1, num2);
                break;
            case 3:
                multiplicacion(num1, num2);
                break;
            case 4:
                division(num1, num2);
                break;
        }

    }

    private static void suma(int num1, int num2) {

        System.out.println("La suma de los valores ingresados es: ");
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

    }

    private static void resta(int num1, int num2) {

        System.out.println("La resta de los valores ingresados es: ");
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

    }

    private static void multiplicacion(int num1, int num2) {

        System.out.println("La multiplicacion de los valores ingresados es: ");
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

    }

    private static void division(int num1, int num2) {

        System.out.println("La division de los valores ingresados es: ");
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

    }
}
