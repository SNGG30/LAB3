/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_felipegarcia_12211249;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Pgaseosos extends Planetas{
    
    private long presion;
    private int anillos;

    public Pgaseosos() {
    }
    public Pgaseosos(long presion, int anillos, String Nombre, long Masa, int radio, long temperatura, long escape, ArrayList<Lunas> L) {
        super(Nombre, Masa, radio, temperatura, escape, L);
        this.presion = presion;
        this.anillos = anillos;
    }

    public long getPresion() {
        return presion;
    }

    public void setPresion(long presion) {
        this.presion = presion;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }
    
    public String toString() {
        return "Nombre: " + getNombre() + " | Masa: " + getMasa() + " | Radio: " + " | Temperatura: " + getTemperatura() + " | Escape: " + getEscape() + " | Lunas: [" + getL() + "] | Planeta: Gaseoso | Presion: " + presion + "Numero de anillos: " + anillos;
    }
}
