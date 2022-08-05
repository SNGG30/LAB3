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
    private long altura;

    public Dfases() {
    }
    public Dfases(int fases, int motores, long altura, long pesosoport, String nombre, long serie, int potencia) {
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

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
    
    
    
    public String toString(long pesosoport, String nombre, long serie, int potencia, int fases, int motores, long altura){
        
        return "Peso soportable: " + pesosoport + " | Nombre del cohete: " + nombre + " | Serie del cohete: " + serie + " | Potencia: " + potencia + " | Cantidad de fases " + fases + " | Cantidad de motores: " + motores + " | Altura de la nave: " + altura;
    }
}
