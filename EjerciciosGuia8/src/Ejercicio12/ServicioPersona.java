/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.*;

/**
 *
 * @author usuario
 */
public class ServicioPersona {

    public Persona crearPersona() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Persona per = new Persona();
        System.out.println("Ingrese nombre de la persona");
        per.setNombre(read.next());
        System.out.println("Ingrese fecha de nacimiento aaaa/mm/dd");
        Date aux = new Date(read.nextInt() - 1900, read.nextInt() - 1, read.nextInt());
        per.setFechaNac(aux);
        return per;
    }

    public int calcularEdad(Persona per) {
        Date aux = new Date();
        if (aux.getMonth() < per.getFechaNac().getMonth()) {
            return ((aux.getYear() - per.getFechaNac().getYear()) - 1);
        } else {
            return (aux.getYear() - per.getFechaNac().getYear());
        }
    }

    public boolean menorQue(Persona per, int x) {
        if (calcularEdad(per) < x) {
            return true;
        } else {
            return false;
        }
    }
    
        public String mostrarPersona(Persona per) {
        return "Persona{" + "nombre=" + per.getNombre() + ", fechaNac=" + per.getFechaNac() + '}';
    }
    
}
