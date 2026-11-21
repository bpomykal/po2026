package agh.po.symulator;

public class Silnik extends Komponent{
    int maxObroty;
    int obroty;

    public Silnik(String producent, String model, int maxObroty){
        super(producent, model);
        this.maxObroty = maxObroty;
    }

    public void uruchom(){
        obroty = 800; // obroty jałowe po uruchomieniu
    }

    public void zatrzymaj(){
        obroty = 0; // zatrzymanie pracy silnika
    }
}
