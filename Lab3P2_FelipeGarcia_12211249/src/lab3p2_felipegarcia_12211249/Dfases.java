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
public class Dfases extends Cohetes{
    
    private int fases;
    private int motores;
    private double altura;

    public Dfases() {
    }
    public Dfases(double pesosoport, String nombre, long serie, int potencia, int fases, int motores, double altura) {
        super(pesosoport, nombre, serie, potencia);
        this.fases = fases;
        this.motores = motores;
        this.altura = altura;
    }

    public int getFases() {
        return fases;
    }

    public void setFases(int fases) {
        this.fases = fases;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    public String toString(){
        
        return "Peso soportable: " + getPesosoport() + " | Nombre del cohete: " + getNombre() + " | Serie del cohete: " + getSerie() + " | Potencia: " + getPotencia() + " | Cantidad de fases " + fases + " | Cantidad de motores: " + motores + " | Altura de la nave: " + altura;
    }
}
