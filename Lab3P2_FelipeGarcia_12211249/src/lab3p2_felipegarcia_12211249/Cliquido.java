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
public class Cliquido extends Cohetes{
    
    private double gasolina;

    public Cliquido() {
    }
    public Cliquido(double pesosoport, String nombre, long serie, int potencia, double gasolina, ArrayList<Personas> P) {
        super(pesosoport, nombre, serie, potencia, P);
        this.gasolina = gasolina;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
    
    public String toString(){
        
        return "Peso soportable: " + getPesosoport() + " | Nombre del cohete: " + getNombre() + " | Serie del cohete: " + getSerie() + " | Potencia: " + getPotencia() + " | Gasolina: " + gasolina + " | Personas en el cohete: [" + getP() + "]";
    }
    
}
