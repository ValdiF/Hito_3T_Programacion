package com.mycompany.hito_3.override_overload;

/**
 *
 * @author valdi
 */
public class Futbolista extends Jugador{
    public String entrenar(){
        return "estoy entrenando";
    }
    
    public String entrenar(String lugar){ //Overload - sobrecarga
        return "Estoy entrenando en "+lugar;
    }
    
    public void jugar(){ //override - sobreescritura del método con el mismo nombre que proviene de su padre Jugador
        System.out.println("El futbolista está jugando");
    }
}
