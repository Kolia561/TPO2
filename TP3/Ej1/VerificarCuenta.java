package TP3.Ej1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VerificarCuenta implements Runnable {
    private final CuentaBanco cb = new CuentaBanco();

    private void HacerRetiro(final int cantidad) throws InterruptedException {
        synchronized (cb){
        if (cb.getBalance() >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " está realizando un retiro de: " + cantidad + ".");
            // Thread.sleep(1000);
            cb.retiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + ": Retiro realizado.");
            System.out.println(Thread.currentThread().getName() + ": Los fondos son de: " + cb.getBalance());
        } else {
            System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr."
                    + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de: " + cb.getBalance());
             //Thread.sleep(1000);
        }
        }
    } // de hacer retiro

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                Thread.sleep(1000); // mejor el sleep aca? asi no duermo adentro del synchronized
                this.HacerRetiro(10);
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta está sobregirada.");
                }
            } catch (final InterruptedException ex) {
           Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex); }
    }
}
}