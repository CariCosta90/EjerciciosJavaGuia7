/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeciciosextrajava_guia7;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio2_extras {

    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C = 15;
        int D = 20;
        int aux;
        
        System.out.println("Los valores en este punto son: A="+A+" B="+B+" C="+C+" D="+D);
        
        aux=B;
        //B tome el valor de C = 15
        B=C;
        //C tome el valor de A = 5
        C=A;
        //A tome el valor de D = 20
        A=D;
        //D tome el valor de B = 10
        D=aux;
        
        System.out.println("Los valores despues del cambio son: A="+A+" B="+B+" C="+C+" D="+D);       
        
    }
}
