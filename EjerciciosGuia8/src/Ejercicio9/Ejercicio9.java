/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica x = new Matematica(Math.random() * 10, Math.random() * 10);
        System.out.println("Los numeros son: " + x.getNum1() + " y " + x.getNum2());
        System.out.println("El mayor es: " + x.devolverMayor());
        System.out.println("La potencia del mayor es: " + x.calcularPotencia());
        System.out.println("La raiz cuadrada del menor es " + x.calculaRaiz());

        System.out.println("Los numeros son: " + x.getNum1() + " y " + x.getNum2());

    }

}
