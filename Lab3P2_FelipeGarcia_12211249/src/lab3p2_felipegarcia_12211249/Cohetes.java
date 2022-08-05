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
public class Cohetes {
    
    private double pesosoport;
    private String nombre;
    private long serie;
    private int potencia;
    ArrayList <Personas> P;

    public Cohetes() {
    }
    public Cohetes(double pesosoport, String nombre, long serie, int potencia, ArrayList<Personas> P) {
        this.pesosoport = pesosoport;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.P = P;
    }

    public double getPesosoport() {
        return pesosoport;
    }

    public void setPesosoport(double pesosoport) {
        this.pesosoport = pesosoport;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSerie() {
        return serie;
    }

    public void setSerie(long serie) {
        this.serie = serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public ArrayList<Personas> getP() {
        return P;
    }

    public void setP(ArrayList<Personas> P) {
        this.P = P;
    }
    
    

    
}
