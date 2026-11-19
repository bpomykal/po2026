package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    Pozycja aktualnaPozycja;

    boolean stanWlaczenia;
    String nrRejest;
    String model;
    Double predkoscMax;

    public void wlacz(){
        stanWlaczenia = true;
        silnik.uruchom();
    }
    public void wylacz(){
        stanWlaczenia = false;
        silnik.zatrzymaj();
    }
}
