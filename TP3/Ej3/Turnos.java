package TP3.Ej3;

public class Turnos {

    private int turno, max;

    public Turnos(int cant) {

        turno = 1;
        max = cant;
    }

    public int getTurno() {

        return turno;
    }

    private void incrementarTurno() {

        turno++;
        if (turno > max) {
            turno = 1;
        }
    }

    public synchronized void imprimir(char caracter, int pase) {

        if (turno == pase) {
            for (int i = 1; i <= pase; i++) {
                System.out.print(caracter);
            }
            this.incrementarTurno();
        }
    }
}
