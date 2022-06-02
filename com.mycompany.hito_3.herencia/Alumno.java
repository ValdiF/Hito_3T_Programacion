package com.mycompany.hito_3.herencia;

/**
 *
 * @author valdi
 */
public class Alumno extends Persona{
    private String curso;
    private float notaMedia;

    //constructor
    public Alumno(String nombre, String apellido1, String apellido2, int edad, String curso, float notaMedia) {
        super(nombre, apellido1, apellido2, edad);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    
    public void mostrarDatos() {
        System.out.println("Nomrbe y apellidos: "+getNombre()+" "+getApellido1()+" "+getApellido2()+
                "\nEdad: "+getEdad()+
                "\nCurso: "+curso+
                "\nNota Media: "+notaMedia);
    }
    
    
    
}
