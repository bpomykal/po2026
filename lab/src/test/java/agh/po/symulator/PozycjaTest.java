package agh.po.symulator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PozycjaTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testPrzemiescDodatnie() {
        Pozycja p = new Pozycja(0, 0);
        Pozycja cel = new Pozycja(3, 4);

        p.przemiesc(0.1, 10, cel);

        assertEquals(0.6, p.getX(), DELTA);
        assertEquals(0.8, p.getY(), DELTA);
    }

    @Test
    public void testPrzemiescUjemne() {
        Pozycja p = new Pozycja(0, 0);
        Pozycja cel = new Pozycja(-3, -4);

        p.przemiesc(0.1, 10, cel);

        assertEquals(-0.6, p.getX(), DELTA);
        assertEquals(-0.8, p.getY(), DELTA);

        p.przemiesc(0.1, -10, cel);
        assertEquals(-0.6, p.getX(), DELTA);
        assertEquals(-0.8, p.getY(), DELTA);
    }

    @Test
    public void testPrzemiescZero() {
        Pozycja p = new Pozycja(2, 3);
        Pozycja cel = new Pozycja(10, 10);

        p.przemiesc(0.1, 0, cel);
        assertEquals(2.0, p.getX(), DELTA);
        assertEquals(3.0, p.getY(), DELTA);

        p.przemiesc(0, 50, cel);
        assertEquals(2.0, p.getX(), DELTA);
        assertEquals(3.0, p.getY(), DELTA);
    }

    @Test
    public void testPrzemiescCelNull() {
        Pozycja p = new Pozycja(2, 3);

        p.przemiesc(0.1, 10, null);

        assertEquals(2.0, p.getX(), DELTA);
        assertEquals(3.0, p.getY(), DELTA);
    }
}