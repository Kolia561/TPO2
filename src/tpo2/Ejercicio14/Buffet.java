package tpo2.Ejercicio14;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Buffet {

    private Semaphore comida = new Semaphore(0,true); // variable para el manejo de interacciones con la comida del empleado
    private Semaphore ordenMenu = new Semaphore(0,true); // variable para el manejo de interacciones con la orden del menu del empleado
    private Semaphore atencionMozo = new Semaphore(1,true); // variable para adquirir/bloquear atencion de mozo
    private Semaphore silla = new Semaphore(1,true); // variable para adquirir/bloquear uso de la silla del buffet
    private String[] menu = {"Opcion 1", "Opcion 2", "Opcion 3", "Opcion 4"}; // opciones de menu para seleccion del empleado

    //metodo para retornar el menu 

    public String[] getMenu () {
        return menu;
    }
    

    
    //public void sentarse() throws InterruptedException {
    //    silla.acquire(); // adquirir silla del buffet -- Es una sola silla
    //    System.out.println("El empleado " + Thread.currentThread().getName() + " ocupó la slla del buffet.");
    //    Thread.sleep(200);
    //}

    public void llamarMozo() throws InterruptedException{
        atencionMozo.acquire(); // el mozo deja de crear nuevas versiones de pollo y va a atender al empleado
        System.out.println("El mozo va a atender al empleado " + Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println("El mozo pregunta al empleado " +  Thread.currentThread().getName() + " que va a querer comer");
    }


    public void pedirMenu() throws InterruptedException{
            
             // tiene el menu y elige entre las opciones y selecciona su opcion
            int aleatorio = new Random().nextInt(this.menu.length);
            String opcionMenu = this.menu[aleatorio];
            System.out.println("El empleado " + Thread.currentThread().getName() + " va a pedir " + opcionMenu);
            
            ordenMenu.release();        
    }


    public void comer() throws InterruptedException{
            // el mozo le trae la comida y empieza a comer
            comida.acquire();
            System.out.println("El empleado " + Thread.currentThread().getName() + " come y se va.");
            Thread.sleep(5000); // tiempo para comer        
    }

    //public void irse()throws InterruptedException{
    //        // el empleado termina de comer y se retira
    //        silla.release();
    //        System.out.println("El empleado " + Thread.currentThread().getName() +" termina de comer y se levanta de la silla.");
    //        Thread.sleep(1000); // tiempo para dejar el buffet        
    //}

    public void tomarOrden() throws InterruptedException{
                    // el mozo ya se encuentra en la mesa para tomar la orden
            ordenMenu.acquire();
            System.out.println("El mozo tomó la orden y se la lleva al cocinero.");            
            Thread.sleep(1000); // tiempo para llevar la orden al cocinero
    }
    public void servirComida() throws InterruptedException{
            // el cocinero termino de cocinar y el mozo lleva la comida al empleado
            System.out.println("El mozo lleva la comida al empleado.");
            Thread.sleep(1000); // tiempo para llevar la comida  
            comida.release();
                   
    }
    public void terminar() throws InterruptedException{
            // el mozo termina de atender y se pone a crear de nuevo
            
            System.out.println("El mozo sirvió el menu al empleado y vuelva a crear nuevas versiones de pollo.");
            Thread.sleep(200);
            atencionMozo.release();
    }
    
}
