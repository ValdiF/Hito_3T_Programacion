package com.mycompany.hito_3.override_overload;

/**
 *
 * @author valdi
 */

public class Main {
    public static void main(String[] args) {
    Jugador jugador = new Jugador();
    jugador.jugar();
    
    Futbolista futbolista= new Futbolista();
    futbolista.jugar();
    
    String sinsobrecarga = futbolista.entrenar();
    System.out.println(sinsobrecarga);    
    
    String sobrecarga = futbolista.entrenar("Santiago Bernabéu");
    System.out.println(sobrecarga);
    }
}
