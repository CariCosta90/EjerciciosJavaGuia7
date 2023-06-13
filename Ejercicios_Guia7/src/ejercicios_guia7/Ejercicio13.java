/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia7;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de lados");
        int lados = leer.nextInt();
        
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if(i==0){
                    System.out.print("*");
                }else if (j==0){
                    System.out.print("*");
                }else if(j==lados-1){
                    System.out.print("*");
                }else if(i==lados-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }                
            }
            System.out.println("");
        }
        
    }
    
    
}
