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
public class Csolido extends Cohetes{
    
    private double kg;
    private String Material;

    public Csolido() {
    }
    public Csolido(double pesosoport, String nombre, long serie, int potencia, double kg, String Material, ArrayList<Personas> P) {
        super(pesosoport, nombre, serie, potencia, P);
        this.kg = kg;
        this.Material = Material;
        this.P = P;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    public String toString(){
        
        return "Peso soportable: " + getPesosoport() + " | Nombre del cohete: " + getNombre() + " | Serie del cohete: " + getSerie() + " | Potencia: " + getPotencia() + " | Kilos de combustible: " + kg + " | Material: " + Material + " | Personas en el cohete: [" + getP() + "]";
    }
}
