package TP3.Ej4;

public class Surtidor {
    public void surtir(Auto unAuto){
        synchronized(unAuto) {
        System.out.println("se cargara combustible en: "+Thread.currentThread().getName());
        unAuto.cargarCombustible();
        System.out.println("se cargo combustible en: "+Thread.currentThread().getName());
        }
    }

}
