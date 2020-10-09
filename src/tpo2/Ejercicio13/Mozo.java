package tpo2.Ejercicio13;

public class Mozo implements Runnable {

    private Buffet buffet;

    // metodo creador
    public Mozo(Buffet _buffet) {
        this.buffet = _buffet;
    }

    @Override
    public void run() {
        try{ 
            while(true) {
                buffet.tomarOrden();
                buffet.servirComida();
                buffet.terminar();
            }
             } catch (InterruptedException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
    }
}
