/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCafetera {
    /**
     * La capacidad actual de la cafetera se iguala a su capacidad max
     * desde antes)
     * @param caf
     */
    public void llenarCafetera(Cafetera caf){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese capacidad maxima de cafe que posee la cafetera");
        caf.setCapMax(read.nextInt());
        caf.setCapActual(caf.getCapMax());
        System.out.println("La cafetera se lleno con exito");
    }
    
    
    /**
     * La funcion simula la carga de una taza. Se debe pasar por parametro la capacidad de cafe que tiene la taza
     * si la capacidad actual de la cafetera alcanza, se carga con exito y se asigna el nuevo valor a la cafetera
     * Sino, se muestra por pantalla que no alcanzo y hasta donde se lleno la taza
     * @param caf
     * @param cantTaza 
     */
    public void servirTaza(Cafetera caf,int cantTaza){
        if(cantTaza>caf.getCapActual()){
            System.out.println("La taza no logro llenarse, se lleno hasta "+caf.getCapActual());
            caf.setCapActual(0);
        }else{
            System.out.println("La taza se lleno con exito");
            caf.setCapActual(caf.getCapActual()-cantTaza);
        }
    }
    /**
     * La capacidad actual de la cafetera queda en 0
     * @param caf 
     */
    public void vaciarCafetera(Cafetera caf){
        caf.setCapActual(0);
    }
    /**
     * Se debe ingresar una cantidad de cafe que se desee cargar a la capacidad actual de la cafetera
     * @param caf 
     */
    public void agregarCafe(Cafetera caf){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese cantidad de cafe que desea agregar");
        int cantidad=read.nextInt();
        while((cantidad+caf.getCapActual())>caf.getCapMax()){
            System.out.println("La cantidad supera la capacidad maxima de la cafetera, ingrese otro valor");
            cantidad=read.nextInt();
        }
        caf.setCapActual(caf.getCapActual()+cantidad);
    }
}
