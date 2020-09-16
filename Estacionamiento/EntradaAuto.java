package EjemplosTeoria.Estacionamiento;

public class EntradaAuto extends Entradas {
    EstacionamientoAuto estacionamiento;

    public EntradaAuto(EstacionamientoAuto est){
        estacionamiento =  est;
    }

    public void run() {
        for (int i=0; i<15; i++){
            estacionamiento.ingresarAuto();
            yield();
        }
    }
}