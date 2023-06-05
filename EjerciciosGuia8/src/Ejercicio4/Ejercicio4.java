//Ejercicio 4 de la guia 8 POO
package Ejercicio4;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec = new Rectangulo();
        rec.crearRec();
        System.out.println("La base del rectangulo es: "+rec.getBase()+" y la altura: "+rec.getAltura());
        System.out.println("La superficie del rectangulo es: "+rec.superfiicie()+" y el perimetro es: "+rec.perimetro());
        System.out.println("Grafico del rectrangulo: \n");
        rec.dibujaRec();
    }
    
}
