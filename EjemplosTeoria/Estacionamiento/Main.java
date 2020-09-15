package EjemplosTeoria.Estacionamiento;

public class Main {
    public static void main(String[] args) {
        EstacionamientoAuto estAu = new EstacionamientoAuto();
        EstacionamientoMoto estMo = new EstacionamientoMoto();

        Thread entN = new Thread (new EntradaAuto(estAu));
        Thread entS = new Thread (new EntradaAuto(estAu));
        Thread entM = new Thread (new EntradaMoto(estMo));
        Thread salA = new Thread (new SalidaAuto(estAu));
        Thread salM = new Thread (new SalidaMoto(estMo));
            entN.start();
            entS.start();
            entM.start();
            salA.start();
            salM.start();
    }
}
