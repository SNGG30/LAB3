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
public class Personas {
    
    String Nombre;
    int Edad;
    long Peso;

    public Personas() {
    }
    public Personas(String Nombre, int Edad, long Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getPeso() {
        return Peso;
    }

    public void setPeso(long Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " | Edad: " + Edad + " | Peso: " + Peso;
    }
    
    
    
}
