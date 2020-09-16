package TP3.Ej3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Turnos turnos= new Turnos(4);
        Hilo a = new Hilo('A',1,turnos);
        Hilo b = new Hilo('B',2,turnos);
        Hilo c = new Hilo('C',3,turnos);
        Hilo d = new Hilo('D',4,turnos);
        Thread aa = new Thread(a);
        Thread bb = new Thread(b);
        Thread cc = new Thread(c);
        Thread dd = new Thread(d);
            aa.start();
            bb.start();
            cc.start();
            dd.start();

    }
}
