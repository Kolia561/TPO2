/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio12;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Kolia
 */
public class Jaula {
    
    private final ReentrantLock lockRueda;
    private final ReentrantLock lockHamaca;
    private final ReentrantLock lockPlato;

    public Jaula() {
        this.lockRueda = new ReentrantLock();
        this.lockHamaca = new ReentrantLock();
        this.lockPlato = new ReentrantLock();
    }
    
    
    
    
}
