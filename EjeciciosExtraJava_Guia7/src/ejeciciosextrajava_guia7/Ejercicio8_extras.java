/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
import java.util.Scanner;

public class Ejercicio8_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont=1;
        int pares=0;
        int impares=1;
        
        
        System.out.println("Ingresa un numero entero");
        num = leer.nextInt();
        
        while(num>0 && num%5!=0){
            cont++;
            if(num%2==0){
                pares++;
            }else{
                impares++;
            }
            System.out.println("Ingresa otro numero");
            num = leer.nextInt();
        }
        
        System.out.println("cantidad: " + cont);
        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);

    }
}
