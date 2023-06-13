/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
import java.util.Scanner;

public class Ejercicio9_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int cociente = 1;
        int residuo = 0;

        System.out.println("Ingresa el dividendo");
        num1 = leer.nextInt();

        System.out.println("Ingresa el divisor");
        num2 = leer.nextInt();

        residuo = num1 - num2;

        System.out.println(num1 + "-" + num2 + "=" + residuo);
        num1 = residuo;

        while (residuo > num2) {
            residuo = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + residuo);
            num1 = residuo;
            cociente++;
        }

        System.out.println("residuo= " + residuo + " cociente=" + cociente);

    }
}
