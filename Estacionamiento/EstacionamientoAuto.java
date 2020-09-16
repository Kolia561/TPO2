package EjemplosTeoria.Estacionamiento;

public class EstacionamientoAuto extends Estacionamiento {
    private Object cantAutos;
    private final int maxAutos = 10;

    public EstacionamientoAuto(){
        cantAutos = 0;
    }

    public synchronized void ingresarAuto() {
        int aux;
        if ((int)cantAutos<maxAutos) {
            aux = (int) cantAutos;
            cantAutos = aux+1;
            System.out.println("Ingresa un auto, hay "+(int)cantAutos+" de un maximo de: "+maxAutos);
        }
        else{System.out.println("ESTACIONAMIENTO LLENO, SE VA UN AUTO SIN PODER INGRESAR");}
    }

    public synchronized void egresarAuto(){
        if ((int) cantAutos>0) {
            int aux;
            aux = (int) cantAutos;
            cantAutos = aux-1;
            System.out.println("Sale un auto, hay "+(int)cantAutos+" de un maximo de: "+maxAutos);
        } else {System.out.println("ESTACIONAMIENTO DE AUTOS VACIO");}
    }

}
