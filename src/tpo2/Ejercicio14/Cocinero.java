package tpo2.Ejercicio14;

public class Cocinero implements Runnable{

    private Buffet buffet;

    // metodo creador
    public Cocinero(Buffet _buffet) {
        this.buffet = _buffet;
    }

    @Override
    public void run() {
       try{ 
       while(true) {
           buffet.entregarMenu();
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
