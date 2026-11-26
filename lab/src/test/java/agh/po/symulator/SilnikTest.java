package agh.po.symulator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SilnikTest {

    @Test
    public void testUruchomIZatrzymaj() {
        Silnik silnik = new Silnik("Bosch", "V8", 6000);
        assertEquals(0, silnik.getObroty());

        silnik.uruchom();
        assertEquals(800, silnik.getObroty());

        silnik.zatrzymaj();
        assertEquals(0, silnik.getObroty());
    }

    @Test
    public void testKontrolaZakresuObrotow() {
        Silnik silnik = new Silnik("Bosch", "V8", 6000);
        silnik.uruchom();

        // Próba przekroczenia maxObroty
        silnik.zwiekszObroty(10000);
        assertEquals(6000, silnik.getObroty());

        // Próba zejścia poniżej 0
        silnik.zmniejszObroty(8000);
        assertEquals(0, silnik.getObroty());
    }

    @Test
    public void testZwiekszObrotyNaWylaczonymSilniku() {
        Silnik silnik = new Silnik("Bosch", "V8", 6000);

        // Silnik nie został uruchomiony, obroty powinny pozostać 0
        silnik.zwiekszObroty(1000);
        assertEquals(0, silnik.getObroty());
    }
}