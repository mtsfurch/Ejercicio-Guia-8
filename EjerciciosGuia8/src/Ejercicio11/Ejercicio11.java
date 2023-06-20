/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in);
        int dia,mes,anio,diferencia;
        System.out.println("Ingrese aaaa/mm/dd");
        anio=read.nextInt();
        mes=read.nextInt();
        dia=read.nextInt();
        Date fecha=new Date(anio-1900, mes-1, dia);
        Date fechaHoy= new Date();
        System.out.println(fechaHoy);
        System.out.println(fecha);
        diferencia=fechaHoy.getYear()-fecha.getYear();
        System.out.println("La diferencia de años es: "+diferencia);
    }
    
}
