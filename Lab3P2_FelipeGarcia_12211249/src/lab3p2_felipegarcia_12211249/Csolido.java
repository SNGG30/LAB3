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
public class Csolido extends Cohetes{
    
    private long kg;
    private String Material;

    public Csolido() {
    }
    public Csolido(long kg, String Material, long pesosoport, String nombre, long serie, int potencia) {
        super(pesosoport, nombre, serie, potencia);
        this.kg = kg;
        this.Material = Material;
    }

    public long getKg() {
        return kg;
    }

    public void setKg(long kg) {
        this.kg = kg;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    public String toString(long pesosoport, String nombre, long serie, int potencia, long gasolina){
        
        return "Peso soportable: " + pesosoport + " | Nombre del cohete: " + nombre + " | Kilos de combustible: " + kg + " | Material: " + Material;
    }
}
