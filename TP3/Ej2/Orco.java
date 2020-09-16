package TP3.Ej2;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Orco extends Personaje{

    private Target target;

    public Orco(Target tj) {
        target = tj;
    }

    private void operar(){
        target.getTarget().operar(-3);
    }

    public void run() {
        
        try {
            Thread.sleep(2000); 
            this.operar();

        } catch (final InterruptedException ex) {
        Logger.getLogger(Orco.class.getName()).log(Level.SEVERE, null, ex); }
    
    }
}
