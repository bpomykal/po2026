package agh.po.symulator;

public class SkrzyniaBiegow extends Komponent{
    int aktualnyBieg;
    int iloscBiegow; // wszystkie biegi od 1 do n + wsteczny
    Sprzeglo sprzeglo;

    public SkrzyniaBiegow(String producent, String model, int iloscBiegow, Sprzeglo sprzeglo){
        super(producent, model);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
    }

    public void zwiekszBieg(){
        if(aktualnyBieg < iloscBiegow ){
            aktualnyBieg++;
        }
    }
    public void zmniejszBieg(){
        if(aktualnyBieg > 0){
            aktualnyBieg--;
        }
    }
}
