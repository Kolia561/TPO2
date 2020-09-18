package TP3.Ej4;

public class Vehiculo implements Runnable {
    private  String modelo, marca; private String patente;
    private int kmFaltantesParaElService, kmRestantesDeAutonomia;

    public void run() {

    }

    public Vehiculo( String pat,  String mod,  String mar) {
        patente = pat;
        modelo = mod;
        marca = mar;
        kmFaltantesParaElService = 3;
        kmRestantesDeAutonomia = 10;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String otraPatente){
        patente = otraPatente;
    }

    public int getkmFaltantesParaElService(){
        return kmFaltantesParaElService;
    }

    public void realizarService(){
        System.out.println("Se realizará service en: "+Thread.currentThread().getName());
        kmFaltantesParaElService = 10;
    }

    public int getkmRestantesDeAutonomia(){
        return kmRestantesDeAutonomia;
    }

    public void restarKm() {
        System.out.println(Thread.currentThread().getName()+" recorre 1 km");
        kmRestantesDeAutonomia--;
        System.out.println("Km restantes de autonomia de "+Thread.currentThread().getName()+": "+kmRestantesDeAutonomia);
    }

    public void restarKmService() {
        kmFaltantesParaElService--;
    }

    public void cargarCombustible() {
        kmRestantesDeAutonomia = kmRestantesDeAutonomia + 5;
    }

}
