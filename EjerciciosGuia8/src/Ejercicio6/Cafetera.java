/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author usuario
 */
public class Cafetera {

    private int capMax, capActual;

    //constructores
    public Cafetera() {
    }

    public Cafetera(int capMax, int capActual) {
        this.capMax = capMax;
        this.capActual = capActual;
    }
        //Getter and Setter
    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }
    
    //Mostrar cadena
    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", capActual=" + capActual + '}';
    }
    
}
