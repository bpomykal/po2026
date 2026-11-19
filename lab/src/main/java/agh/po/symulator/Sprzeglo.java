package agh.po.symulator;

public class Sprzeglo extends Komponent{
    boolean stanSprzegla;

    public void wcisnij(){
        stanSprzegla =  true;
    }
    public void zwolnij(){
        stanSprzegla = false;
    }
}
