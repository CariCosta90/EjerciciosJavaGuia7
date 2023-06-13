package ejercicios_guia7;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int limite;
        int suma = 0;
        int valor;
        int contador = 0;
        boolean bandera;
        bandera = true;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el valor limite");

        limite = leer.nextInt();

        while (suma < limite) {
            System.out.println("Ingresa un nuevo valor para agregar a la suma");
            valor = leer.nextInt();
            
            if (valor>limite && contador==0){
                System.out.println("El valor ingresado es mayor al limite seleccionado");
                bandera = false;
                break;
            }else{
                suma = suma + valor;
                contador++;
            }            
        }
        
        if (bandera){
            System.out.println("El limite ingresado fue: "+ limite + " y la cantidad de vueltas necesarias para superarlo fue de: " + contador + " , generando una suma final de: " + suma);
        }else{
            System.out.println("El programa se cerro dado que el primer valor ingresado fue mayor al limite");
        }

    }
}
