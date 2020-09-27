/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio6;

/**
 *
 * @author Kolia
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Escritor[] escritores= new Escritor[2];
        Thread[] hilo= new Thread[2];
        Recurso compartido = new Recurso();
        Character[] letras = {'a','b','c'};
        int veces=3;
        
        
        for (int i = 0; i < 3; i++) {

            hilo[i] = new Thread(new Escritor(compartido,letras[i],veces));
            hilo[i].setName("Escritor"+letras[i]);
            hilo[i].start();

        }
        for (int i = 0; i < 3; i++) {

            hilo[i].join();
        }
        System.out.println("");
        System.out.println("Fin de escritura");
        
    }
}
