package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void aktualizujPozycje(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }

    public void przemiesc(double dt, double V, Pozycja cel) {
        if (cel == null || dt <= 0 || V <= 0) {
            return;
        }

        double dx = cel.x - this.x;
        double dy = cel.y - this.y;

        double odleglosc = Math.sqrt(dx * dx + dy * dy);
        if (odleglosc == 0) {
            return;
        }

        double kierunekX = dx / odleglosc;
        double kierunekY = dy / odleglosc;
        double krok = V * dt;

        if (krok >= odleglosc) {
            this.x = cel.x;
            this.y = cel.y;
        }
        else
        {
            aktualizujPozycje(kierunekX * krok, kierunekY * krok);
        }
    }
}