/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double cantidad;

        String moneda;

        System.out.println("Ingresa la cantidad a convertir");
        cantidad = leer.nextDouble();

        System.out.println("Ingresa a que moneda quieres convertirlo: dolar, libra o yen");
        moneda = leer.next();
        moneda = moneda.toLowerCase();

        convertir(cantidad, moneda);

    }

    public static void convertir(double cantidad, String moneda) {
        double convertido;
        convertido = 0;
        switch (moneda) {
            case "dolar":
                convertido = cantidad * 1.28611;
                break;
            case "libra":
                convertido = cantidad * 0.86;
                break;
            case "yen":
                convertido = cantidad * 129.852;
                break;
            default:
                System.out.println("La moneda ingresada no es valida");
                break;
        }
        
        if (convertido!=0){
            System.out.println("Cantidad: " + cantidad + " convertido a: " + moneda + " es: " + convertido);
        }

    }

}
