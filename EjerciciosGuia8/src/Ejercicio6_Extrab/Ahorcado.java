/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6_Extrab;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ahorcado {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String[] palabra;
    private int encontradas, jugadasMax;

    //Constructores
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int jugadasMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
    }

    //Getter and Setter
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = new String[palabra.length];
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    //Operacionales
    //Crea un nuevo juego
    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar y la cantidad maxima de intentos");
        String palabra = read.next();
        String[] palabraVec = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraVec[i] = palabra.substring(i, i + 1);
        }
        setPalabra(palabraVec);
        this.jugadasMax = read.nextInt();
        this.encontradas = 0;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a encontrar es de " + this.palabra.length + " caracteres");
    }

    public void buscarLetra(String letra) {
        int esta = 0;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equalsIgnoreCase(letra)) {
                esta++;
            }
        }
        if (esta != 0) {
            System.out.println("Mensaje: La letra pertence a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertence a la palabra");
        }
    }

    public boolean encontradas(String letra) {
        int esta = 0;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i].equalsIgnoreCase(letra)) {
                esta++;
            }
        }
        if (esta != 0) {
            encontradas += esta;
            System.out.println("Numero de letras(encontradas,faltantes)(" + encontradas + "," + (palabra.length - encontradas));
            return true;
        } else {
            System.out.println("Numero de letras(encontradas,faltantes)(" + encontradas + "," + (palabra.length - encontradas));
            jugadasMax--;
            return false;
        }
    }

    public void intentos() {
        System.out.println("Numero de intentos restantes: " + jugadasMax);
    }

    public void juego() {
        crearJuego();
        do {
            longitud();
            System.out.println("Ingrese letra a buscar");
            String letra = read.next();
            buscarLetra(letra);
            encontradas(letra);
            intentos();
        } while (jugadasMax != 0);
        if (jugadasMax == 0) {
            System.out.println("Lo siento, te quedaste sin intentos, loooooser!");
            System.out.println("La palabra oculta era: ");
            for (int i = 0; i < palabra.length; i++) {
                System.out.print(palabra[i]);
            }
        } else {
            System.out.println("Felicitaciones !! completaste la palabra, WINEEEER!!!");
            for (int i = 0; i < palabra.length; i++) {
                System.out.print(palabra[i]);
            }
        }
    }
}
