/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta usuario= new Cuenta();
        usuario.crearCuenta();
        System.out.println(usuario.toString());
        usuario.ingresarDinero(3500);
        System.out.println(usuario.toString());
        usuario.retirarDinero(5000);
        System.out.println(usuario.toString());
    }
    
}
