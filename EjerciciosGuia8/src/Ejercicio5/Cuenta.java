/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cuenta {

    private String nombre;
    private int dni, NumCuenta;
    private double saldoActual;
    //Constructores

    public Cuenta() {
    }

    public Cuenta(String nombre, int dni, int NumCuenta, double saldoActual) {
        this.nombre = nombre;
        this.dni = dni;
        this.NumCuenta = NumCuenta;
        this.saldoActual = saldoActual;
    }
    // Setter and Getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //Muestra de datos en una sola cadena
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", dni=" + dni + ", NumCuenta=" + NumCuenta + ", saldoActual=" + saldoActual + "$" + '}';
    }

    //Operacionales
    /**
     * Carga los datos del usuario manualmente y se le asigna un numero de
     * cuenta aleatorio
     */
    public void crearCuenta() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre y apellido del usuario");
        setNombre(read.next());
        System.out.println("Ingrese dni del usuario");
        setDni(read.nextInt());
        System.out.println("Ingrese saldo en $");
        setSaldoActual(read.nextDouble());
        setNumCuenta((int) (Math.random() * 999));
    }

    /**
     * Si pasara por parametro un saldo que se le sumara al saldo actual
     *
     * @param sumarDinero
     */
    public void ingresarDinero(double sumarDinero) {
        saldoActual += sumarDinero;
    }
    
    /**
     * Se restara el dinero ingresado por parametro al saldo actual. Si es mayor al saldo actual, el mismo quedara
     * en 0
     * @param sacarDinero 
     */
    public void retirarDinero(double sacarDinero) {
        if (sacarDinero > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= sacarDinero;
        }
    }
    /**
     * Se restara un 20% del saldo actual
     */
    public void extraccionRapida(){
        saldoActual-=((saldoActual*20)/100);
    }
    
}
