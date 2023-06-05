/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.*;

/**
 *
 * @author usuario
 */
public class Rectangulo {

    private int base, altura;

    //Constructures
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    // Sett and Gett

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Operacionales
    /**
     * Crea un objeto de tipo rectangulo
     *
     * @return x
     */
    public Rectangulo crearRec() {
        Rectangulo x = new Rectangulo();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese base del rectangulo");
        x.setBase(read.nextInt());
        System.out.println("Ingrese altura del rectangulo");
        x.setAltura(read.nextInt());
        return x;
    }

    /**
     * Devuelve la superfie del objeto tipo rectangulo
     *
     * @return
     */
    public int superfiicie() {
        return base * altura;
    }

    /**
     * Retorna el perimetro del objeto tipo rectangulo
     *
     * @return
     */
    public int perimetro() {
        return ((base + altura) * 2);
    }

    /**
     * Dibuja el objeto rectangulo
     */
    public void dibujaRec() {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                for (int j = 0; j < base; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < base; j++) {
                    if (j == 0 || j == base - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
