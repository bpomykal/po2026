package agh.po.animals;

public class Parrot extends Animal {
    public Parrot() {
        legs = 2;
        name = "Adam";
    }

    @Override
    public String getDescription() {
        return "To jest papuga, ma na imię " + name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " mówi: Kra! Witaj!");
    }
}
