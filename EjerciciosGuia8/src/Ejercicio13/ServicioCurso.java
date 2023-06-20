/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author saras
 */
public class ServicioCurso {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos(Curso c1, String[] nombre) {
        c1.setAlumnos(nombre);
    }

    public void cargarAlumnosMostrar(Curso c1) {
        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.println(c1.getAlumnos()[i]);
        }
    }

    public Curso crearCurso() {
        Curso c2 = new Curso();
        
        String[] nombre = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los nombres del alumno");
            nombre[i] = read.next();
        }
        
        cargarAlumnos(c2,nombre);
        cargarAlumnosMostrar(c2);
        
        System.out.println("Ingrese el nombre del curso");
        c2.setNombreCurso(read.next());
        
        System.out.println("Ingrese la cantidad de horas por dia.");
        c2.setCantidadHorasPorDia(read.nextInt());
        
        System.out.println("Ingrese la cantidad de dias por semana.");
        c2.setCantidadDiasPorSemana(read.nextInt());
        
        System.out.println("Ingrese el turno (mañana/noche)");
        c2.setTurno(read.next());
        
        System.out.println("Ingrese el precio por hora.");
        c2.setPrecioPorHora(read.nextDouble());
        
        return c2;
    }
    
    public void calcularGananciaSemanal(Curso c1){
//        cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana
        System.out.println("La ganancia semanal es de: $ "+ (c1.getCantidadDiasPorSemana()*c1.getCantidadHorasPorDia()
                *c1.getPrecioPorHora()*5) );
        
    }
}
