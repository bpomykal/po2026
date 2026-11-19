package agh.po.symulator;

public class Pozycja {
    Double x;
    Double y;

    public void aktualizujPozycje(Double deltaX, Double deltaY){
        x = deltaX;
        y = deltaY;
    }
    public record Point(Double x, Double y){};
    public Point getPozycja(){
        return new Point(x, y);
    }
}
