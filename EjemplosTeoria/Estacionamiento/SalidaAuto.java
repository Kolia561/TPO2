package EjemplosTeoria.Estacionamiento;

public class SalidaAuto extends Salidas{
    EstacionamientoAuto estacionamiento;

    public SalidaAuto(EstacionamientoAuto est){
        estacionamiento =  est;
    }

    public void run(){
        for (int i=0; i<15; i++){           
            estacionamiento.egresarAuto();
            yield();
        }
    }
}