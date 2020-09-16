package EjemplosTeoria.Estacionamiento;

public class EstacionamientoMoto extends Estacionamiento{
    private int cantMotos;
    private final int maxMotos = 10;

    public EstacionamientoMoto(){
        cantMotos = 0;
    }
    
    public synchronized void ingresarMoto() {
        if (cantMotos<maxMotos) {
            cantMotos = cantMotos+1;
            System.out.println("Ingresa una moto, hay "+cantMotos+" de un maximo de: "+maxMotos);
        }else{System.out.println("ESTACIONAMIENTO LLENO, SE VA UNA MOTO SIN PODER INGTRESAR");}
    }
    
    public synchronized void egresarMoto(){
        if (cantMotos>0) {
            cantMotos = cantMotos-1;
            System.out.println("Sale una moto, hay "+cantMotos+" de un maximo de: "+maxMotos);
        }else {System.out.println("ESTACIONAMIENTO DE MOTOS VACIO");}
    }    
}
