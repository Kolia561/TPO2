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
public class Testigo {

    private Semaphore testigo = new Semaphore(1, true);
    private Semaphore largada = new Semaphore(1, true);

    public void tomarTestigo() {

        try {

            testigo.acquire();

        } catch (InterruptedException ex) {

            Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void largar() throws InterruptedException { //el Atleta larga
        largada.acquire();
    }

    public void entregarTestigo() {
        largada.release();  //libera para que largue el proximo atleta
        testigo.release();

    }

}
