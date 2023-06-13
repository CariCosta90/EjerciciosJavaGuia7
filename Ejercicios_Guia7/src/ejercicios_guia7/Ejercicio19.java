/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //definimos las matrices
        //Matriz A ingresada a mano
        int[][] matrizA = new int[3][3];
        
        //generamos codigo para ingresar a mano los valores de matrizA
        int num;
        System.out.println("Ingresa los 9 numeros para la matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num=leer.nextInt();
                matrizA[i][j]=num;
            }
        }
        
        //llamamos funcion para imprimir matriz con el valor de la matrizA
        System.out.println("La matriz A es: ");
        imprimirMatriz(matrizA);
        
        
        //Matriz B transpuesta de A
        int[][] matrizB = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]=matrizA[j][i];
            }
        }
        
        //llamamos funcion para imprimir matriz con el valor de la matrizb
        System.out.println("La matriz B es: ");
        imprimirMatriz(matrizB);
        
        //Evaluar si matrizA[i][j] == - matrizB[i][j] --> si se cumple para todos los valores la matriz es anti simetrica (usar bandera)
        
        boolean bandera = true;
        //hago un for que recorra las matrices comparando los numeros que estan en la misma posicion en ambas matrices, se pasara a falso si en cualquier caso no se cumple la condicion matrizA[i][j] == - matrizB[i][j] 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!(matrizA[i][j]== -matrizB[i][j])){
                    bandera=false;
                }
            }            
        }
        
        //if para mostrar el resultado dependiendo de bandera 
        if (bandera){
            System.out.println("La matriz es anti simetrica");
        }else{
            System.out.println("La matriz no es anti simetrica");
        }
        
    }
    
    public static void imprimirMatriz(int[][] matriz){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }        
    }
}
