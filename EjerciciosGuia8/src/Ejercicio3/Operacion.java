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
public class Operacion {

    private int numero1, numero2;

    //Construcor
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //GETTER AND SETTER

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // METODOS DE OPERACION
    public int suma() {
        return numero1 + numero2;
    }

    public int resta() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        if (numero1 != 0 && numero2 != 0) {
            return numero1 * numero2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
    public int dividir() {
        if (numero2 == 0 || numero1 == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return (numero1 / numero2);
        }
    }

}
