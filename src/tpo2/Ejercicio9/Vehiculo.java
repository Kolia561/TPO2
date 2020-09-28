/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio9;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Vehiculo {

    Semaphore semTaxista = new Semaphore(0);
    Semaphore semCliente = new Semaphore(0);

    public void tomarTaxi() {

        try {
            semTaxista.release();

            System.out.println("El cliente se subio al taxi y procede a viajar");

            semCliente.acquire();

        } catch (InterruptedException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bajarTaxi() {
        
        
    }

    public void conducirTaxi() {

        try {
            semTaxista.acquire();

            System.out.println("El taxista comienza a conducir");

        } catch (InterruptedException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void arriboDestino() {
        
        semCliente.release();
            
        System.out.println("El vehiculo llego a destino");
        
        
        try {
            semTaxista.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
