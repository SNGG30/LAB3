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
public class Procosos extends Planetas{
    
    private long densidad;
    private boolean vida;
    
    public Procosos(){
    }
    public Procosos(String Nombre, long Masa, int radio, long temperatura, long escape, ArrayList<Lunas> L, long densidad, boolean vida) {
        super(Nombre, Masa, radio, temperatura, escape, L);
        
        this.densidad = densidad;
        this.vida = vida;
    }

    public long getDensidad() {
        return densidad;
    }

    public void setDensidad(long densidad) {
        this.densidad = densidad;
    }

    public boolean getVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public String toString() {
        return "Nombre: " + getNombre() + " | Masa: " + getMasa() + " | Radio: " + " | Temperatura: " + getTemperatura() + " | Escape: " + getEscape() + " | Lunas: [" + getL() + "] | Planeta: Rocoso | Densidad: " + densidad + "Hay vida: " + vida;
    }
}
