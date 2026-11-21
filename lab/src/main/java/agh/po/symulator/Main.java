package agh.po.symulator;

public class Main {
    public static void main(String[] args){
        Silnik silnik = new Silnik("BMW", "M54", 6500);
        Sprzeglo sprzeglo = new Sprzeglo("Sachs", "Standard");
        SkrzyniaBiegow skrzynia = new SkrzyniaBiegow("ZF", "6HP", 6, sprzeglo);
        Pozycja pozycja = new Pozycja(0,0);

        Samochod auto = new Samochod(silnik, skrzynia, pozycja, "KR 12345", "E46", 230.0);

        auto.wlacz();
        sprzeglo.wcisnij();
        auto.skrzynia.zwiekszBieg();
        auto.skrzynia.zwiekszBieg();
        auto.skrzynia.zmniejszBieg();
        sprzeglo.zwolnij();

        System.out.println("Silnik (obroty): " + auto.silnik.obroty);
        System.out.println("Bieg: " + auto.skrzynia.aktualnyBieg);
        System.out.println("Sprzeglo wcisniete: " + sprzeglo.stanSprzegla);

        auto.wylacz();
        System.out.println("Po wylaczeniu - obroty: " + auto.silnik.obroty + ", bieg: " + auto.skrzynia.aktualnyBieg);
    }
}
