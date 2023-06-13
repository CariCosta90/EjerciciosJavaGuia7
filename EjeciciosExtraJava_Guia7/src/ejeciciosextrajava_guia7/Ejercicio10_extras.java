/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
import java.util.Scanner;

public class Ejercicio10_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int solucion = num1 * num2;

        System.out.println(num1 + "*" + num2 + "=" + solucion);

        System.out.println("Ingresa tu respuesta");
        int respuesta = leer.nextInt();

        while (solucion != respuesta) {
            System.out.println("Respuesta incorrecta, ingresa otro numero");
            respuesta = leer.nextInt();
        }

        System.out.println("Felicitaciones! descubriste el numero");

    }
}
