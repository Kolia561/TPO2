/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Atleta implements Runnable {

    private Testigo recuTestigo;
    private Long tiempoInicioCarrera;

    public Atleta(Testigo recuTestigo, Long _tiempoInicioCarrera) {
        
        this.recuTestigo = recuTestigo;
        this.tiempoInicioCarrera = _tiempoInicioCarrera;
        
    }

    public void run() {
        
        try {
            System.out.println(Thread.currentThread().getName() + " esta en la pista");  
            
            recuTestigo.tomarTestigo();
            
            System.out.println("El atleta " + Thread.currentThread().getName() + " toma testigo y empieza a correr"); 
            
            float tiempoCarrera = (float)(Math.random()*(11000-9000+1)+9000);

            Thread.sleep((long) tiempoCarrera); // tiempo en hacer su carrera

            System.out.println("El atleta " + Thread.currentThread().getName() + " termina de correr y entrega testigo");
            
            long tiempoFinCarrera = System.currentTimeMillis(); // tiempo en el que empieza a correr

            long tiempoTotalCarrera = tiempoFinCarrera - tiempoInicioCarrera;

            System.out.println("Tiempo " + Thread.currentThread().getName() + ": " + (long)tiempoCarrera/1000 + " seg");
    
            System.out.println("Tiempo de carrera : " + tiempoTotalCarrera/1000 + " seg");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        } finally{        
            recuTestigo.entregarTestigo();
        }

    }

}
