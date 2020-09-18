package TP3.Ej4;

public class Auto extends Vehiculo {
    private Surtidor surtidor;

    public Auto (String pat, String mod, String mar, Surtidor surt){
        super(pat, mod, mar);
        surtidor = surt;
    }

    public Auto (Surtidor surt){   //a fines de no hacer un main tan complicado
        super("test", "test", "test");
        surtidor = surt;
    }

    public void run() {

        for (int i=0; i<50; i++) {
            if (this.getkmRestantesDeAutonomia() > 2) { //se considera que a los 2 km esta con la reserva y debe de cargar combustible
                this.restarKm();
                if (this.getkmFaltantesParaElService() >0) {
                    this.restarKmService();
                }else {this.realizarService();;}
            } else { surtidor.surtir(this);}
            Thread.yield();
        }
    }

}
