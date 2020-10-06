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
public class Main {

    public static void main(String[] args) {

        Thread[] hilos = new Thread[5];
        Jaula jaulaComun = new Jaula();

        for (int i = 0; i < hilos.length; i++) {

            hilos[i] = new Thread(new Hamster(jaulaComun), ("Hamster " + (i + 1)) );
            hilos[i].start();
        }
    }

}
