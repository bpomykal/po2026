package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    public static void main(String[] args){
        Animal[] animals = new Animal[100];
        Random r = new Random();
        for(int i = 0; i<100; i++){
            int num = r.nextInt(3);
            switch (num){
                case 0: animals[i] = new Dog(); break;
                case 1: animals[i] = new Parrot(); break;
                case 2: animals[i] = new Snake(); break;
            }
            int sum = 0;
            for(Animal animal: animals){
                sum = sum + animal.getLegs();
                animal.getDescription();
            }

        }
    }
}
