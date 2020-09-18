package TP3.Ej4;

public class Main {
    public static void main(String[] args) {
        Surtidor surtidor = new Surtidor();
  
        Thread auto1 = new Thread(new Auto(surtidor), "auto 1");
        Thread auto2 = new Thread(new Auto(surtidor), "auto 2");
        Thread auto3 = new Thread(new Auto(surtidor), "auto 3");
        Thread auto4 = new Thread(new Auto(surtidor), "auto 4");
        Thread auto5 = new Thread(new Auto(surtidor), "auto 5");

        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();
        auto5.start();

    }
    
}
