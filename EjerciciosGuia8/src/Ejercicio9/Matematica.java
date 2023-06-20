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
public class Matematica {

    private double num1, num2;

    public Matematica() {

    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        } else {
            System.out.println("Ambos numeros son iguales");
            return num1;
        }
    }

    public double calcularPotencia() {
        double num1 = Math.round(this.num1);
        double num2 = Math.round(this.num2);
        if (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                return Math.pow(num1, num2);
            } else {
                return Math.pow(num2, num1);
            }

        } else {
            System.out.println("Un numero es igual a 0");
            return 0.0;
        }
    }

    public double calculaRaiz() {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        if (num1 > num2 && num2 > 0) {
            return Math.sqrt(num2);
        } else if (num1 < num2 && num1 > 0) {
            return Math.sqrt(num1);
        }
        return 0;
    }
}
