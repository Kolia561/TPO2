package TP3.Ej2;

public class Target {
    private Personaje pj = new Personaje();

    public Target(){

    }
    
    public void setTarget(Personaje target){
        pj = target;
    }
    
    public Personaje getTarget(){
        return pj;
    }

}