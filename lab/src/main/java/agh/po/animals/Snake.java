package agh.po.animals;

public class Snake extends Animal {
    public Snake() {
        legs = 0;
        name = "Bazyliszek";
    }

    @Override
    public String getDescription() {
        return "To jest wąż, ma na imię " + name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " mówi: Ssssss...");
    }
}
