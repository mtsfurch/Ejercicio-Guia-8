/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        Cafetera caf = new Cafetera();
        ServicioCafetera sc = new ServicioCafetera();
        sc.llenarCafetera(caf);
        System.out.println(caf.toString());
        sc.servirTaza(caf, 3);
        System.out.println(caf.toString());
        sc.vaciarCafetera(caf);
        System.out.println(caf.toString());
        sc.agregarCafe(caf);
        System.out.println(caf.toString());
    }

}
