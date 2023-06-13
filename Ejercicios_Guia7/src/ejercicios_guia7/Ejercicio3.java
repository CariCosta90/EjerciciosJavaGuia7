package ejercicios_guia7;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
import java.util.Scanner;
public class Ejercicio3 {
    


    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        frase = leer.nextLine();
        
        convertirFrase(frase);      
        
    }
    public static void convertirFrase(String frase){
        System.out.println("La frase en minusculas es: " + frase.toLowerCase());
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
    }
}

