package tpo2.Ejercicio13;

public class Empleado implements Runnable {

    private Buffet buffet;

    // metodo creador
    public Empleado(Buffet _buffet) {
        this.buffet = _buffet;
    }

    @Override
    public void run() {
        try {
            //buffet.sentarse();
            buffet.llamarMozo();
            buffet.pedirMenu();
            buffet.comer();
            //buffet.irse();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
