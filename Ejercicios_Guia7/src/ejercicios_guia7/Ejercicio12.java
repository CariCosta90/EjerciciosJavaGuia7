package ejercicios_guia7;

/*

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().

 */
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        ingresarCadena(contadorCorrectas, contadorIncorrectas);
    }

    public static void ingresarCadena(int contadorCorrectas, int contadorIncorrectas) {

        Scanner leer = new Scanner(System.in);
        String cadenaIngresada;
        System.out.println("Ingresa una cadena");
        cadenaIngresada = leer.next();
        cadenaIngresada = cadenaIngresada.toLowerCase();

        evaluarCadena(cadenaIngresada, contadorCorrectas, contadorIncorrectas);
    }

public static void evaluarCadena(String cadenaIngresada, int contadorCorrectas, int contadorIncorrectas) {
        String fde = "&&&&&";
        
        if (cadenaIngresada.equals(fde)) {
            System.out.println("La ejecución ha finalizado");
            System.out.println("El resumen del programa es el siguiente:");
            System.out.println("Lecturas correctas: " + contadorCorrectas);
            System.out.println("Lecturas incorrectas: " + contadorIncorrectas);
        } else if (cadenaIngresada.length() > 5) {
            System.out.println("La cadena ingresada debe tener máximo 5 caracteres de largo");
            ingresarCadena(contadorCorrectas, contadorIncorrectas);
        } else if (cadenaIngresada.substring(0, 1).equals("x") && cadenaIngresada.substring(cadenaIngresada.length() - 1).equals("o")) {
            System.out.println("Lectura correcta");
            contadorCorrectas++;
            ingresarCadena(contadorCorrectas, contadorIncorrectas);
        } else {
            System.out.println("Lectura incorrecta");
            contadorIncorrectas++;
            ingresarCadena(contadorCorrectas, contadorIncorrectas);
        }
    }
}
