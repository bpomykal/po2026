package agh.po.symulator;

public class Pozycja {
    double x;
    double y;

    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void aktualizujPozycje(double deltaX, double deltaY){
        x = deltaX;
        y = deltaY;
    }
    public String getPozycja(){
        return "(" + x + ", " + y + ")";
    }
}
