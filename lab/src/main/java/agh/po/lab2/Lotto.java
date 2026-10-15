package agh.po.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        while(lista.size()<6){
            int w = r.nextInt(1, 50);
            if (!lista.contains(w)) {
                lista.add(w);
            }
        }
        System.out.println("Twoje typy: " + Arrays.toString(args));
        System.out.println("Wylosowane liczby: " + lista);
        int b = 0;
        for (String arg : args) {
            int typ = Integer.parseInt(arg);
            if (lista.contains(typ)) {
                b++;
            }
        }

        System.out.println("Liczba trafień: " + b);

    }
}
