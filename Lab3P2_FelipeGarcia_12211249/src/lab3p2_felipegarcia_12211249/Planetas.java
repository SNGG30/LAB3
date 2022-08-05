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
    private double Masa;
    private int radio;
    private double temperatura;
    private double escape;
    ArrayList <Lunas> L;

    public Planetas() {
    }
    public Planetas(String Nombre, double Masa, int radio, double temperatura, double escape, ArrayList<Lunas> L) {
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

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getEscape() {
        return escape;
    }

    public void setEscape(double escape) {
        this.escape = escape;
    }

    public ArrayList<Lunas> getL() {
        return L;
    }

    public void setL(ArrayList<Lunas> L) {
        this.L = L;
    }
    
    
}
