/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio9;

/**
 *
 * @author Kolia
 */
public class Main {
    
    public static void main(String[] args) {
        
        Thread[] hilos = new Thread[2];
        Vehiculo coche = new Vehiculo();
        
        hilos[0]=new Thread(new Cliente(coche));
        hilos[1]=new Thread(new Taxista(coche));
        
        for (int i = 0; i < 2; i++) {
            
            hilos[i].start();
        }
        
        
        
        
    }
    
}
