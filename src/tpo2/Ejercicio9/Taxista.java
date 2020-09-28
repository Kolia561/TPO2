/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Taxista implements Runnable{
    
    private Vehiculo coche;

    public Taxista(Vehiculo coche) {
        this.coche = coche;
    }
    
    
    
    public void run(){
    
    
        try {
            coche.conducirTaxi();
            Thread.sleep((int)(1000*Math.random()));
            coche.arriboDestino();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxista.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
