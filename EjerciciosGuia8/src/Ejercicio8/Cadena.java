/*
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
 */
package Ejercicio8;

public class Cadena {
    private String frase;
    private int longitud;

        //Contructor
    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    //Getter && Setter
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud() {
        longitud =  frase.length();
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    //Operacionlaes
    
    public void mostrarVocales(){
    int contador=0;
        for (int i = 0; i < longitud; i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase("a")||frase.substring(i, i+1).equalsIgnoreCase("e")||
                    frase.substring(i, i+1).equalsIgnoreCase("i")||frase.substring(i, i+1).equalsIgnoreCase("o")||
                    frase.substring(i, i+1).equalsIgnoreCase("u")){
                contador++;
            }
        }
        System.out.println("Se encontraron "+contador+" vocales");
}
    public void invertirFrase(){
        String frase2 = "";
        for (int i = longitud; i > 0; i--) {
          //  System.out.print(frase.substring(i-1, i));
           frase2 = frase2+frase.substring(i-1, i);
            
        }
        System.out.println(frase2);
    }
    
    public void vecesRepetido(String letra){
        int contador=0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("La letra "+letra+" se encontro "+contador+" veces");
    }
    
    public void compararLongitud(String frase){
        if (frase.length()== this.frase.length()) {
            System.out.println("Las frases poseen la misma longitud");
        }else if(frase.length()> this.frase.length()){
            System.out.println("La frase ingresada es mayor a la original");
        }else System.out.println("La frase original es mayor a la ingresada");
    }
    
    public void unirFrase(String frase){
        System.out.println(this.frase.concat(frase));
    }
    
    public void reemplazar(String letra){
        String aux="";
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase("a")) {
                aux=aux.concat(letra);
            }else{
                aux=aux.concat(frase.substring(i, i+1));
            }
        }
        System.out.println("La nueva frase es: ");
        System.out.println(aux);
    }
    
    public boolean contiene(String letra){
        boolean aux=false;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
                aux=true;
                return aux;
            }
        }
        return aux;
    }
}
