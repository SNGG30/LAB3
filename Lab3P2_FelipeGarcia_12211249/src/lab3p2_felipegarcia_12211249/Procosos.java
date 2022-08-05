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
public class Procosos extends Planetas{
    
    private long densidad;
    private String vida;
    
    public Procosos(){
    }
    
    
    public Procosos(String Nombre, long Masa, int radio, long temperatura, long escape, ArrayList<Lunas> L, long densidad, String vida) {
        super(Nombre, Masa, radio, temperatura, escape, L);
        
        this.densidad = densidad;
        this.vida = vida;
    }
}
