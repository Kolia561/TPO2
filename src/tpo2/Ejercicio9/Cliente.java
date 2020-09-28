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
public class Cliente implements Runnable {

    private Vehiculo coche;

    public Cliente(Vehiculo coche) {
        this.coche = coche;
    }

    public void run() {

        while (true) {
        // if (coche.subirVehiculo()) {
        try {
            coche.subirVehiculo();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   

            coche.iniciarViaje();
            System.out.println("El Cliente se va");
            coche.bajarTaxi();
        }

    }
}
