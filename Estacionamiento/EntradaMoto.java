package EjemplosTeoria.Estacionamiento;

public class EntradaMoto extends Entradas{
    EstacionamientoMoto estacionamiento;

    public EntradaMoto(EstacionamientoMoto est){
        estacionamiento =  est;
    }

    public void run(){
        for (int i=0; i<15; i++){
            estacionamiento.ingresarMoto();
            yield();
        }
    }
}
