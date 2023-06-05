/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;
import java.util.*;
/**
 *
 * @author usuario
 */
public class ServicioLibro {
    public Libro cargarLibro(){
        Libro libro = new Libro();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBN del libro");
        libro.setISBN(read.nextInt());
        System.out.println("Ingrese titulo del libro");
        libro.setTitulo(read.next());
        System.out.println("Ingrese autor del libro");
        libro.setAutor(read.next());
        System.out.println("Ingrese numeros de paginas");
        libro.setNumPag(read.nextInt());
        return libro;
    }
}
