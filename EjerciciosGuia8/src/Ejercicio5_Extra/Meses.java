/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_Extra;

/**
 *
 * @author usuario
 */
// Constructor
public class Meses {
    public Meses(){
   meses = new String[12];
   meses[0]="enero";
   meses[1]="febrero";
   meses[2]="marzo";
   meses[3]="abril";
   meses[4]="mayo";
   meses[5]="junio";
   meses[6]="julio";
   meses[7]="agosto";
   meses[8]="septiembre";
   meses[9]="octubre";
   meses[10]="noviembre";
   meses[11]="diciembre";
   int aux=(int) (Math.random() * 12);
   mesSecreto=meses[aux];
    }
    //Getter and Setter
    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    //Operacional
    //Iguales
    public boolean iguales(String mes){
        boolean aux= false;
        if(mes.equals(mesSecreto)){
            aux=true;
        }
        return aux;
    }
    
    
    
    private String[] meses;
    private String mesSecreto;
}
