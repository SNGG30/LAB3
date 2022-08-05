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
public class Lunas {
    
    private String Nombre;
    private int Crateres;

    public Lunas() {
    }

    public Lunas(String Nombre, int Crateres) {
        this.Nombre = Nombre;
        this.Crateres = Crateres;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCrateres() {
        return Crateres;
    }

    public void setCrateres(int Crateres) {
        this.Crateres = Crateres;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " | Crateres: " + Crateres;
    }
    
    
    
}
