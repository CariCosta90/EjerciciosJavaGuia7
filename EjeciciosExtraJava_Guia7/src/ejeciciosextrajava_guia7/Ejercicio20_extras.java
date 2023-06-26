
package ejeciciosextrajava_guia7;

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/


public class Ejercicio20_extras {
    public static void main(String[] args) {
        //primer funcion tiene que rellenar un vector con numeros aleatorios
        
        //creamos el arreglo 
        
        int[] arreglo = new int[5];      
        
        
        int [] arregloCreado = rellenarArreglo(arreglo);
        
        //segunda funcion tiene que imprimir el vector
        
        funcionMostrar(arregloCreado);
    }
    
    public static int[] rellenarArreglo(int[] arreglo){
     
      
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) Math.floor(Math.random() * 11); 
        } 
        
        return arreglo;
        
    }
    
    public static void funcionMostrar(int[] arreglo){
        
        System.out.println("El arreglo generado es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
    }
}
