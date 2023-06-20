/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicion10;

import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 *
 * @author saras
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] A = new double[50];
        double[] B = new double[20];

//        Inicializa A con aleatorio
        for (int i = 0; i < 50; i++) {
            A[i] = Math.random() * 100;
        }

//       Ordena A de menor a mayor
        Arrays.sort(A, 0, 50);
       
        /*
        Version sin utilizar funcion Java de ordenar de menor a mayor
        
        for (int i = 0; i < 50; i++) {
            double aux=A[i];
            double aux1=0;
            for (int j = i; j < 50; j++) {
                if(aux>A[j]){
                    aux1=aux;
                    aux=A[j];
                    A[j]=aux1;
                }
            }A[i]=aux;
        } */
        
//        Inicializa los 10 primeros de B copiando los de A
        System.arraycopy(A, 0, B, 0, 10);
        
//        Inicializa los segundos 10 de B
        for (int i = 10; i < 20; i++) {
            B[i] = 0.5;
        }
        
//        Mostramos B
        System.out.println("\n VECTOR B");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%.2f \t", +B[i]);
        }
        
//        Mostramos A
        System.out.println("\n VECTOR A");
        for (int i = 0; i < 50; i++) {
            System.out.printf("%.2f \t", +A[i]);
        }
        
    }

}
