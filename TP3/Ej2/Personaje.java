package TP3.Ej2;


public class Personaje implements Runnable {

    private int vida = 10;
    
    public Personaje(){
    }

    public int getVida(){
        return vida;
    }

    public synchronized void operar(int valor) {
        
        if (valor > 0) {
            System.out.println(Thread.currentThread().getName() + " está realizando una sanacion de: " + 3 + " puntos de vida.");
        } else {
            System.out.println(Thread.currentThread().getName() + " está realizando un golpe de: " + 3 + " puntos de vida.");
        }
            vida = vida + valor;
        System.out.println(Thread.currentThread().getName() + ": Los puntos de vida restantes son: " + vida);
    }

    public void run() {
           
    }
}
