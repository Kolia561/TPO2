package TP3.Ej2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sanador extends Personaje {
    private int poder;
    private Target target;

    public Sanador() {
        poder = 3;
    }

    public void setTarget(Target otroTarget) {
        target = otroTarget;
    }

    public Sanador(Target tj) {
        target = tj;
        poder = 3;
    }

    private void operar() {
        target.getTarget().operar(poder);
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