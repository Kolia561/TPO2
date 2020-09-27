/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo2.Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Kolia
 */
public class Recurso {

    private Semaphore semA= new Semaphore(1);
    private Semaphore semB= new Semaphore(0);
    private Semaphore semC= new Semaphore(0);
    private String letra;
    private int veces;
    private String nombreT;
    private Map<Character, List<Semaphore>> m = new HashMap<Character, List<Semaphore>>();
    private List<Semaphore> lista = new ArrayList<Semaphore>();
    private List<Semaphore> lista2 = new ArrayList<Semaphore>();
    private List<Semaphore> lista3 = new ArrayList<Semaphore>();

    public Recurso() {

        
        lista.add(semA);
        lista.add(semB);
        lista2.add(semB);
        lista2.add(semC);
        lista3.add(semC);
        lista3.add(semA);
        
        this.m.put('a', lista);
        this.m.put('b', lista2);
        this.m.put('c', lista3);


    }





    public void escribir(Character letra , int times) {

        List m;
        

       

    }

    
}
