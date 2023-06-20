/*
 * un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario
 */
package Ejercicio6_Extra;

import java.util.*;

/**
 *
 * @author usuario
 */
public class Ahorcado {
    
    private String[] palabra;
    private int encontradas, cantMax;
    // Constructores

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int cantMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.cantMax = cantMax;
    }

    public String[] getPalabra() {
        return palabra;
    }
    // Getter and Setter

    public void setPalabra(String[] palabra, int tamanio) {
        //this.palabra=palabra.clone();
        this.palabra = new String[tamanio];
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    //Operacionales
    public void crearJuego() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la palabra a adivinar");
        String palabraAux = read.next();
        System.out.println("Ingrese cantidad maxima de intentos");
        setCantMax(read.nextInt());
        String[] aux2 = new String[palabraAux.length()];
        for (int i = 0; i < palabraAux.length(); i++) {
            aux2[i] = palabraAux.substring(i, i + 1);
        }
        setPalabra(aux2, palabraAux.length());
        setEncontradas(0);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es de " + getPalabra().length);
    }

    public void buscarLetra(String letra) {
        int esta = 0;
        for (int i = 0; i < getPalabra().length; i++) {
            if (getPalabra()[i].equalsIgnoreCase(letra)) {
                esta++;
            }
        }
        if (esta != 0) {
            System.out.println("La letra se encuentra " + esta + " veces");
        } else {
            System.out.println("La letra no se encuentra");
        }
    }

    public boolean encontradas(String letra) {
        boolean retorno;
        int contador=0;
        int longitud=getPalabra().length;
        for (int i = 0; i < getPalabra().length; i++) {
            if (getPalabra()[i].equalsIgnoreCase(letra)) {
                longitud--;
                contador++;
                setEncontradas(getEncontradas()+1);
            }
        }
         if (contador != 0) {
            System.out.println("La letra se encontro " + contador + " veces y faltan "
            + (getPalabra().length - getEncontradas()) + " por encontrar");
             System.out.println("Le quedan "+getCantMax()+" de intentos");
            retorno= true;
        } else {
            System.out.println("La letra no se encuentra y quedan "+longitud+" de letras por encontrar");
            setCantMax(getCantMax()-1);
            System.out.println("Le quedan "+getCantMax()+" de intentos");
            retorno=false;
        }
        return retorno;
    }
    
    public void juego(){
        Scanner read= new Scanner(System.in).useDelimiter("\n");
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese letra a buscar");
            if(encontradas(read.next())){
                
            }
            if (getEncontradas() == getPalabra().length) {
                break;
            }
            
        } while (getCantMax()!= 0);
        if (getCantMax()== 0) {
            System.out.println("Lo siento, te quedaste sin intentos, loooooser!");
        }else{
            System.out.println("Felicitaciones !! completaste la palabra ");
            for (int i = 0; i < getPalabra().length; i++) {
                System.out.print(getPalabra()[i]);
            }
        }
        
    }
    
}
