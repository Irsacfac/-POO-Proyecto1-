/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.util.ArrayList;

/**
 *
 * @author hdavi
 */
public class Game {
    
    private int cantJugadores;
    private ArrayList<Jugador> jugadores;
    private int cantTurnos;
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        venJuego ventana = new venJuego();
        ventana.setVisible(true);
    }
    
}
