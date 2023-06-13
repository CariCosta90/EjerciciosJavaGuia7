
package ejercicios_guia7;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingresa dos valores para operar");
        
       num1=leer.nextInt();
       num2=leer.nextInt(); 
       
       mostrarMenu(leer, num1, num2);
        
    }
    
    public static void mostrarMenu(Scanner leer, int num1, int num2){
        
        int menu;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        System.out.println("Ingresa el valor deseado del menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        menu = leer.nextInt();
        
        
        while(menu>=6 || menu<1){
            System.out.println("El valor ingresado no corresponde a una opcion valida del menu, ingresa el valor nuevamente");
            System.out.println("-------------------------------------------------------------------------------------------");
            mostrarMenu(leer, num1, num2);
        }       
        
        switch (menu) {
            case 1:
                suma = num1+num2;
                System.out.println("La suma de los numeros ingresados es de: " + suma);
                mostrarMenu(leer, num1, num2);
                break;
            case 2:
                resta = num1-num2;
                System.out.println("La resta de los numeros ingresados es de: " + resta);
                mostrarMenu(leer, num1, num2);
                break;
            case 3:
                multiplicacion = num1*num2;
                System.out.println("La multiplicacion de los numeros ingresados es de: " + multiplicacion);
                mostrarMenu(leer, num1, num2);
                break;
            case 4:
                division = num1/num2;
                System.out.println("La division de los numeros ingresados es de: " + division);
                mostrarMenu(leer, num1, num2);
                break;
            case 5:
                System.out.println("Saliendo del programa...");    
                break;
        }       
        

        
    }
}
