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

    /** Los semaforos que se van a encargar de manejar
     * que letra corresponde imprimir.
     * El primer semaforo se inicia con un permiso, porque
     * se necesita que por algun lado comience a escribir
    */
    private Semaphore semA = new Semaphore(1);
    private Semaphore semB = new Semaphore(0);
    private Semaphore semC = new Semaphore(0);
    

    /**Creo un HasMap para poder asociar las letras con los semaforos que
     * daran paso a la escritura.
     *  Utilizo List como Value porque la documentacion de oracle lo hace asi
     * no se si con un simple array se podria hacer pero por las dudas lo 
     * segui de la misma forma
     */
    private Map<Character, List<Semaphore>> m = new HashMap<Character, List<Semaphore>>();
    
    /**Como use List, tuve que crear una para cada key porque no estaba seguro si al
     *  pasarcelas al HashMap lo hace por referencia o por valor.
     */
    private List<Semaphore> lista1 = new ArrayList<Semaphore>();
    private List<Semaphore> lista2 = new ArrayList<Semaphore>();
    private List<Semaphore> lista3 = new ArrayList<Semaphore>();

    public Recurso() {
        
        //Lleno cada lista con sus respectivos semaforos
        lista1.add(semA);
        lista1.add(semB);
        lista2.add(semB);
        lista2.add(semC);
        lista3.add(semC);
        lista3.add(semA);

        //Y se las asocia a cada letra(key)
        this.m.put('a', lista1);
        this.m.put('b', lista2);
        this.m.put('c', lista3);

    }

    public boolean escribir(Character letra, int times) throws InterruptedException {
        /** Este es el metodo que se encargaria de imprimir las letras.
         * Va a recibir por parametro que tiene que imprimir (Character letra)
         * y lo va a imprimir (int times) haga falta.
         * Si la letra no esta en el HashMap devuelve false
         */
        boolean rta= false;
        List<Semaphore> listaux;
        
        listaux = m.get(letra);

        if (listaux != null) {
            
            rta=!rta;
            listaux.get(0).acquire();   //Pide por el tura para ecribir
            
            for (int i = 0; i < times; i++) {
                System.out.print(letra);
            }
            
            listaux.get(1).release(); //Le cede el turno a la siguiente "letra"

        }
        return rta;
    }

}
