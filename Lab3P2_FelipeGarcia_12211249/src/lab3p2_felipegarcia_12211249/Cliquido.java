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
public class Cliquido extends Cohetes{
    
    private long gasolina;

    public Cliquido() {
    }
    public Cliquido(long gasolina, long pesosoport, String nombre, long serie, int potencia) {
        super(pesosoport, nombre, serie, potencia);
        this.gasolina = gasolina;
    }

    public long getGasolina() {
        return gasolina;
    }

    public void setGasolina(long gasolina) {
        this.gasolina = gasolina;
    }
    
    public String toString(long pesosoport, String nombre, long serie, int potencia, long gasolina){
        
        return "Peso soportable: " + pesosoport + " | Nombre del cohete: " + nombre + " | Serie del cohete: " + serie + " | Potencia: " + potencia + " | Gasolina: " + gasolina;
    }
    
}
