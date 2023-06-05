/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServiOperacion {
    public Operacion crearOperacion(){
        Scanner read = new Scanner(System.in);
        Operacion x = new Operacion();
        System.out.println("Ingrese primer numero");
        x.setNumero1(read.nextInt());
        System.out.println("Ingrese segundo numero");
        x.setNumero2(read.nextInt());
        return x;
    }
    
    
}
