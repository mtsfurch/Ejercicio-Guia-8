/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia radio= new Circunferencia();
        ServicioCircunferencia sc = new ServicioCircunferencia();
        radio=sc.crearCircunferencia();
        System.out.println("Radio: "+radio.getRadio()+" Area: "+sc.area(radio)+" Perimetro: " + sc.perimetro(radio));
    }
    
}
