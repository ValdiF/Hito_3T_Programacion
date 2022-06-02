package com.mycompany.hito_3.herencia;

/**
 *
 * @author valdi
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Jorge", "Pérez", "Alcudia", 14, "3ºA", 7.85f);
        Profesor profesor = new Profesor("Alma", "Teruel", "Toledano", 34, "Matemáticas");
        
        alumno.mostrarDatos();
        
        System.out.println("--------------------------------");
        
        profesor.mostrarDatos();
    }
}
