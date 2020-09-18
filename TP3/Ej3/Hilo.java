package TP3.Ej3;

public class Hilo implements Runnable {

    private char caracter;
    private int pase;
    private Turnos turnos;

    public Hilo(char carac, int pas, Turnos turno) {
        caracter = carac;
        pase = pas;
        turnos = turno;
    }

    public int getPase() {
        return pase;
    }

    public int getCaracter() {
        return caracter;
    }

    public void run() {
        boolean f;
        for (int i = 0; i < 10; i++) {
            f = false;
            while (!f) {
                if (turnos.getTurno() == pase) {
                    turnos.imprimir(caracter, pase);
                    f = true;
                } else {
                    Thread.yield();
                }
            }
        }
    }

}
