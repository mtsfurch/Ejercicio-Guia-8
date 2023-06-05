/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese radio");
        c1.setRadio(read.nextDouble());
        return c1;
    }
    public double area(Circunferencia c1){
        return (Math.PI * (c1.getRadio()*c1.getRadio()));
    }
    public double perimetro(Circunferencia c1){
        return (2*Math.PI*c1.getRadio());
    }
}
