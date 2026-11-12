package agh.po.animals;

public class Dog extends Animal{
    public String getDescription(){
        legs = 4;
        name = "Max";
        return "To jest pies, ma na imię " + name;
    }
}
