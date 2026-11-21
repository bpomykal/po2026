package agh.po.symulator;

public class Sprzeglo extends Komponent{
    boolean stanSprzegla;

    public Sprzeglo(String producent, String model){
        super(producent, model);
    }
    public void wcisnij(){
        stanSprzegla =  true;
    }
    public void zwolnij(){
        stanSprzegla = false;
    }
}
