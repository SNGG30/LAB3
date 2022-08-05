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
public class Planetas {
    
    private String Nombre;
    private long Masa;
    private int radio;
    private long temperatura;
    private long escape;
    ArrayList <Lunas> L;

    public Planetas() {
    }
    public Planetas(String Nombre, long Masa, int radio, long temperatura, long escape, ArrayList<Lunas> L) {
        this.Nombre = Nombre;
        this.Masa = Masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.escape = escape;
        this.L = L;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getMasa() {
        return Masa;
    }

    public void setMasa(long Masa) {
        this.Masa = Masa;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(long temperatura) {
        this.temperatura = temperatura;
    }

    public long getEscape() {
        return escape;
    }

    public void setEscape(long escape) {
        this.escape = escape;
    }

    public ArrayList<Lunas> getL() {
        return L;
    }

    public void setL(ArrayList<Lunas> L) {
        this.L = L;
    }
    
    
}
