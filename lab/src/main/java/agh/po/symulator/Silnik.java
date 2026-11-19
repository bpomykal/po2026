package agh.po.symulator;

public class Silnik extends Komponent{
    int maxObroty;
    int obroty;

    public void uruchom(){
        obroty = 800; // obroty jałowe po uruchomieniu
    }
    public void zatrzymaj(){
        obroty = 0; // zatrzymanie pracy silnika
    }
}
