/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio12;

/**
 *
 * @author Kolia
 */
public class Hamster implements Runnable {

    private Jaula jaulaComun;

    public Hamster(Jaula jaulaComun) {
        this.jaulaComun = jaulaComun;

    }

    @Override
    public void run() {

        while (true) {
            if (!jaulaComun.usaRueda()) {

                System.out.println("El "+ Thread.currentThread().getName()+" no pudo usar la rueda");
            }
            if (!jaulaComun.comer()) {
                
                System.out.println("El "+ Thread.currentThread().getName()+" no pudo comer");
            }

            if (!jaulaComun.usarAmaca()) {
                
                System.out.println("El "+ Thread.currentThread().getName()+" no pudo usar la amaca");
            }
            
            jaulaComun.pasear();

        }
    }
}
