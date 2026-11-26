package agh.po.symulator;

public class Silnik extends Komponent {
    public int maxObroty;
    public int obroty;

    public Silnik(String producent, String model, int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        if (obroty == 0) {
            obroty = Math.min(800, maxObroty); // obroty jałowe po uruchomieniu
        }
    }

    public void zatrzymaj() {
        obroty = 0; // zatrzymanie pracy silnika
    }

    public void zwiekszObroty(int zmiana) {
        if (obroty == 0 || zmiana <= 0) {
            return;
        }
        obroty += zmiana;
        if (obroty > maxObroty) {
            obroty = maxObroty;
        }
    }

    public void zwiekszObroty() {
        zwiekszObroty(100);
    }

    public void zmniejszObroty(int zmiana) {
        if (zmiana <= 0) {
            return;
        }
        obroty -= zmiana;
        if (obroty < 0) {
            obroty = 0;
        }
    }

    public void zmniejszObroty() {
        zmniejszObroty(100);
    }

    public int getObroty() {
        return obroty;
    }

    public int getMaxObroty() {
        return maxObroty;
    }
}