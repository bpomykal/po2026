package agh.po.animals;

public class Dog extends Animal {
    public Dog() {
        legs = 4;
        name = "Max";
    }

    @Override
    public String getDescription() {
        return "To jest pies, ma na imię " + name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " mówi: Hau hau!");
    }
}
