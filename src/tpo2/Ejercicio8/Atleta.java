/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio8;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Atleta implements Runnable {

    private Testigo recuTestigo;

    public Atleta(Testigo recuTestigo) {
        
        this.recuTestigo = recuTestigo;
        
    }

    public void run() {
        
        try {
            
            recuTestigo.tomarTestigo();
            Thread.sleep((int)(2000*Math.random()));
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        
        recuTestigo.entregarTestigo();
        }

    }

}
