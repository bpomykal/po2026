package agh.po.symulator;

public class Samochod {
    Silnik silnik;
    SkrzyniaBiegow skrzynia;
    Pozycja aktualnaPozycja;

    boolean stanWlaczenia;
    String nrRejest;
    String model;
    double predkoscMax;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, Pozycja aktualnaPozycja, String nrRejest, String model, double predkoscMax){
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.stanWlaczenia = false;
    }

    public void wlacz(){
        stanWlaczenia = true;
        silnik.uruchom();
    }
    public void wylacz(){
        stanWlaczenia = false;
        silnik.zatrzymaj();
        skrzynia.aktualnyBieg = 0;
    }
}
