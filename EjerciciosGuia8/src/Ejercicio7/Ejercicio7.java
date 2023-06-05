/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] personas = new Persona[4];
        ServicioPersona sp = new ServicioPersona();
        int pesoIdeal, sobrepeso, pesoBajo, mayorEdad,menorEdad;
        pesoIdeal = sobrepeso = pesoBajo = mayorEdad = menorEdad=0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Carga de persona numero " + (i + 1));
            System.out.println("");
            personas[i] = sp.crearPersona();
            if (sp.calcularIMC(personas[i]) == 1) {
                sobrepeso++;
            } else if (sp.calcularIMC(personas[i]) == -1) {
                pesoBajo++;
            } else {
                pesoIdeal++;
            }
            if(sp.mayorEdad(personas[i])){
                mayorEdad++;
            }else menorEdad++;
        }
        for (Persona x: personas) {
            System.out.println(x.toString());
        }
        System.out.println("");
        System.out.println("Cantidad de personas con peso ideal: "+pesoIdeal+"\nCantidad de personas con"
                + "sobrepeso: "+sobrepeso+"\nCantidad de personas debajo del peso ideal: "+pesoBajo
        +"\nPersonas mayores de edad: "+mayorEdad+"\nPersonas menores de edad: "+ menorEdad);
    }

}
