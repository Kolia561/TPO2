package EjemplosTeoria.Estacionamiento;

public class SalidaMoto extends Salidas{
    EstacionamientoMoto estacionamiento;

    public SalidaMoto(EstacionamientoMoto est){
        estacionamiento =  est;
    }

    public void run(){
        for (int i=0; i<15; i++){
            estacionamiento.egresarMoto();
            yield();
        }
    }
}