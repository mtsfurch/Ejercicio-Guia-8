/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiOperacion op = new ServiOperacion();
        Operacion numeros=op.crearOperacion();
        System.out.println("Los numeros son: "+numeros.getNumero1()+" y "+numeros.getNumero2());
        System.out.println("La suma de los numeros es: "+ numeros.suma());
        System.out.println("La resta de los numeros es: "+ numeros.resta());
        System.out.println("La division de los numeros es: "+ numeros.dividir());
        System.out.println("La multiplicacion de los numeros es: "+ numeros.multiplicar());
    }
    
}
