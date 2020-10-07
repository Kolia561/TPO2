/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio12;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Jaula {

    private final ReentrantLock lockRueda;
    private final ReentrantLock lockHamaca;
    private final ReentrantLock lockPlato;

    private Iterator<Long> tiempo;

    public Jaula() {

        this.lockRueda = new ReentrantLock();
        this.lockHamaca = new ReentrantLock();
        this.lockPlato = new ReentrantLock();

        this.tiempo = new Random().longs(1000, 2000).iterator();
    }

    public boolean usaRueda() {

        boolean rta = false;

        if (lockRueda.tryLock()) {

            try {
                System.out.println("-------" + Thread.currentThread().getName() + " esta usando la rueda");
                Thread.sleep(tiempo.next());
                System.out.println("-------" + Thread.currentThread().getName() + " termino de usar la rueda");

            } catch (InterruptedException ex) {
                Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                rta = true;
                lockRueda.unlock();
            }

        }

        return rta;
    }

    public boolean comer() {
        boolean rta = false;

        if (lockPlato.tryLock()) {

            try {
                System.out.println("........" + Thread.currentThread().getName() + " esta comiendo");
                Thread.sleep(tiempo.next());
                System.out.println("........" + Thread.currentThread().getName() + " termino de comer");

            } catch (InterruptedException ex) {
                Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                rta = true;
                lockPlato.unlock();

            }

        }

        return rta;
    }

    public boolean usarAmaca() {
        boolean rta = false;

        if (lockHamaca.tryLock()) {

            try {
                System.out.println("----....----" + Thread.currentThread().getName() + " esta usando la hamaca");
                Thread.sleep(tiempo.next());
                System.out.println("----....----" + Thread.currentThread().getName() + " termino de usar la hamaca");

            } catch (InterruptedException ex) {
                Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                rta = true;
                lockHamaca.unlock();

            }

        }

        return rta;
    }

    public void pasear() {
        try {
            System.out.println("----....---- El " + Thread.currentThread().getName() + " esta paseando");
            Thread.sleep(tiempo.next());
        } catch (InterruptedException ex) {
            Logger.getLogger(Jaula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
