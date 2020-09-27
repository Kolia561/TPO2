/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Escritor implements Runnable {

    private final Recurso recu;
    private final Character letra;
    private final int veces;

    public Escritor(Recurso unRecu,Character unaLetra,int cuantasVeces) {

        this.recu = unRecu;
        this.letra=unaLetra;
        this.veces=cuantasVeces;
        

    }

    public void run() {

        try {
            this.recu.escribir(letra,veces);
        } catch (InterruptedException ex) {
            Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
