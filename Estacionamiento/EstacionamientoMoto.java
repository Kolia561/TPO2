package EjemplosTeoria.Estacionamiento;

public class EstacionamientoMoto extends Estacionamiento{
    private Object cantMotos;
    private final int maxMotos = 10;

    public EstacionamientoMoto(){
        cantMotos = 0;
    }
    
    public synchronized void ingresarMoto() {
        int aux;
        if ((int)cantMotos<maxMotos) {
            aux = (int) cantMotos;
            cantMotos = aux+1;
            System.out.println("Ingresa una moto, hay "+(int)cantMotos+" de un maximo de: "+maxMotos);
        }else{System.out.println("ESTACIONAMIENTO LLENO, SE VA UNA MOTO SIN PODER INGTRESAR");}
    }
    
    public synchronized void egresarMoto(){
        if ((int)cantMotos>0) {
            int aux;
            aux = (int) cantMotos;
            cantMotos = aux-1;
            System.out.println("Sale una moto, hay "+(int)cantMotos+" de un maximo de: "+maxMotos);
        }else {System.out.println("ESTACIONAMIENTO DE MOTOS VACIO");}
    }    
}
