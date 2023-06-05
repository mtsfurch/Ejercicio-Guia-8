/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;
import java.util.*;
/**
 *
 * @author usuario
 */
public class ServicioPersona {
    public Persona crearPersona(){
        //Instanciar un objeto de tipo persona para luego retornarlo
        Persona per = new Persona();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre y apellido de la persona");
        per.setNombre(read.next());
        System.out.println("Ingrese la edad de la persona");
        per.setEdad(read.nextInt());
        System.out.println("Ingrese sexo correspondiente a la persona\n H)Hombre\n M)Mujer\n O)Otro");
        per.setSexo(read.next().charAt(0));
        while(per.getSexo() != 'M' && per.getSexo() != 'H' && per.getSexo() != 'O'){
            System.out.println("Letra incorrecta, ingrese nuevamente y verifique que este en mayuscula");
            per.setSexo(read.next().charAt(0));
        }
        System.out.println("Ingrese altura de la persona en m");
        per.setAltura(read.nextDouble());
        System.out.println("Ingrese peso de la persona en Kg");
        per.setPeso(read.nextDouble());
        return per;
    }
    
    /**
     * Devuelve -1 si la persona esta por debajo del peso ideal, 1 si lo supera y 0 si esta en el peso ideal
     * @param per
     * @return 
     */
    public int calcularIMC(Persona per){
        double resultado=(per.getPeso()/(Math.pow(per.getAltura(), 2)));
        if(resultado<20){
            return -1;
        }else if(resultado>25){
            return 1;
        }else return 0;
    }
    /**
     * retorna true o flase dependiendo si la persona es mayor o no de 18 años de edad
     * @param per
     * @return 
     */
    public boolean mayorEdad(Persona per){
        if(per.getEdad()>=18){
            return true;
        }else return false;
    }
}
