/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
import java.util.Scanner;

public class Ejercicio5_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        int monto;

        System.out.println("Ingrese el tipo de socio, A, B o C");
        socio = leer.next();

        socio = socio.toUpperCase();

        while (!socio.equals("A") && !socio.equals("B") && !socio.equals("C")) {
            System.out.println("Ese tipo de socio no es correcto, ingresa el valor nuevamente");
            socio = leer.next();
            socio = socio.toUpperCase();
        }
        
        System.out.println("Ingresa el monto del producto a comprar");
        monto = leer.nextInt();
        
        switch (socio) {
            case "A":
                System.out.println("El valor del producto sin descuento es de: " + monto + " y el valor con el descuento de socio A (50%) es de: " + monto*0.5);
                break;
            case "B":
                System.out.println("El valor del producto sin descuento es de: " + monto + " y el valor con el descuento de socio B (35%) es de: " + monto*0.65);
                break;
            case "C":
                System.out.println("El valor del producto sin descuento es de: " + monto + " y el socio tipo C no cuenta con descuentos");
                break;

        }
    }

}
