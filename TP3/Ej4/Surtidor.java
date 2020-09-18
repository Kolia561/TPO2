package TP3.Ej4;

public class Surtidor {
    public synchronized void surtir(Auto unAuto){
        System.out.println("se cargara combustible en: "+Thread.currentThread().getName());
        unAuto.cargarCombustible();
        System.out.println("se cargo combustible en: "+Thread.currentThread().getName());
    }

}
