/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_felipegarcia_12211249;

/**
 *
 * @author felip
 */
public class Cohetes {
    
    private long pesosoport;
    private String nombre;
    private long serie;
    private int potencia;

    public Cohetes() {
    }
    public Cohetes(long pesosoport, String nombre, long serie, int potencia) {
        this.pesosoport = pesosoport;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
    }

    public long getPesosoport() {
        return pesosoport;
    }

    public void setPesosoport(long pesosoport) {
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

    
}
