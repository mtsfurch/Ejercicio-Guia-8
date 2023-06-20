/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

/**
 *
 * @author usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona();
        ServicioPersona sp= new ServicioPersona();
        per=sp.crearPersona();
        System.out.println(per.getFechaNac());
        System.out.println(sp.calcularEdad(per));
        System.out.println(sp.menorQue(per, 28));
        System.out.println(sp.mostrarPersona(per));
    }
    
}
