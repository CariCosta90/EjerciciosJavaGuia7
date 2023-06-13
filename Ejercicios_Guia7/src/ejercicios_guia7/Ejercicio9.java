package ejercicios_guia7;

/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra que inicie con la letra a");
        String palabra = leer.next();
        palabra = toLowerCase(palabra);
//        char letra = palabra.charAt(0);
//        if(letra == 'a'){
//            System.out.println("Correcto");
//        }else{
//            System.out.println("Incorrecto");
//        }

        // version con substring y equals ()
        if (palabra.substring(0, 1).equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
