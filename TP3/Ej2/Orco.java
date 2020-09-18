package TP3.Ej2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Orco extends Personaje {
    private int poder;

    public Orco() {
        poder = -3;
    }

    public Orco(Personaje tj) {
        this.setTarget(tj);
        poder = -3;
    }

    private void operar() {
        this.getTarget().operar(poder);
    }

    public void run() {

        try {
            Thread.sleep(2000);
            this.operar();

        } catch (final InterruptedException ex) {
            Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
