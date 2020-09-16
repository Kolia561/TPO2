package EjemplosTeoria.Estacionamiento;

public class EstacionamientoAuto extends Estacionamiento {
    private int cantAutos;
    private final int maxAutos = 10;

    public EstacionamientoAuto(){
        cantAutos = 0;
    }

    public synchronized void ingresarAuto() {
        if (cantAutos<maxAutos) {
            cantAutos = cantAutos+1;
            System.out.println("Ingresa un auto, hay "+ cantAutos+" de un maximo de: "+maxAutos);
        }else{System.out.println("ESTACIONAMIENTO LLENO, SE VA UN AUTO SIN PODER INGRESAR");}
    }

    public synchronized void egresarAuto(){
        if (cantAutos>0) {
            cantAutos = cantAutos-1;
            System.out.println("Sale un auto, hay "+ cantAutos+" de un maximo de: "+maxAutos);
        } else {System.out.println("ESTACIONAMIENTO DE AUTOS VACIO");}
    }

}
