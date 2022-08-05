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
public class Pgaseosos extends Planetas{
    
    private long presion;
    private int anillos;
    
    public Pgaseosos(String Nombre, long Masa, int radio, long temperatura, long escape, ArrayList<Lunas> L, long presion, int anillos) {
        super(Nombre, Masa, radio, temperatura, escape, L);
        
    }
}
