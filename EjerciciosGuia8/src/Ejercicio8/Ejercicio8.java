/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.*;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadena cad1 = new Cadena();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String letra, fraseUsuario;
        
        System.out.println("Ingrese frase");
        cad1.setFrase(read.next());
        cad1.setLongitud();
        System.out.println(cad1.toString());
        
        cad1.mostrarVocales();
        
        cad1.invertirFrase();
        
        System.out.println("");
        System.out.println("Ingrese la letra que desea buscar en la frase");
        letra = read.next();
        cad1.vecesRepetido(letra);
        
        
        System.out.println("Ingrese frase");
        fraseUsuario = read.next();
        cad1.reemplazar(letra);
        System.out.println("");
        
        cad1.compararLongitud(fraseUsuario);
        System.out.println("");
        cad1.unirFrase(fraseUsuario);
        
        System.out.println("La letra "+letra+" se encuentra en la frase: "+cad1.contiene(letra));
    }
}
