package Ejercicio14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author saras
 */
public class ServicioMovil {
    Scanner read =  new Scanner(System.in);
    public void cargarCelular(Movil m1){


        System.out.println("Ingrese la marca del celular");
        m1.setMarca(read.next());
        
        System.out.println("Ingrese el modelo del celular");
        m1.setModelo(read.next());
        
        System.out.println("Ingrese el precio del celular");
        m1.setPrecio(read.nextInt());
        
        System.out.println("Ingrese la memoria ram del celular");
        m1.setMemoriaRam(read.nextInt());
        
        System.out.println("Ingrese el almacenamiento del celular");
        m1.setAlmacenamiento(read.nextInt());
        
        ingresarCodigo(m1);
        mostrar(m1);
        
    }
    
    public void ingresarCodigo(Movil m1){
        int[] codigo = new int[7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el digito del codigo");
            codigo[i] = read.nextInt();
        }
        
        m1.setCodigo(codigo);
    }
    
     public void mostrar(Movil m1) {
        for (int i = 0; i < 7; i++) {
            System.out.println(m1.getCodigo()[i]);
        }
    }
    
}
