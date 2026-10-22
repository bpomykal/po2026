package agh.po.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lotto_3 {
    public static void main(String[] args) {
        System.out.println("Twoje typy: " + Arrays.toString(args));

        ArrayList<Integer> typy = new ArrayList<>();
        for (String arg : args) {
            typy.add(Integer.parseInt(arg));
        }

        Random r = new Random();
        int b = 0;
        long drawCount = 0;

        long startTime = System.currentTimeMillis();

        while (b < 6) {
            drawCount++;
            b = 0;
            ArrayList<Integer> lista = new ArrayList<>();

            while (lista.size() < 6) {
                int w = r.nextInt(1, 50);
                if (!lista.contains(w)) {
                    lista.add(w);
                }
            }

            for (Integer typ : typy) {
                if (lista.contains(typ)) {
                    b++;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Trafiono 6/6!");
        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + drawCount);
        System.out.println("Łączny czas działania programu: " + duration + " ms");
    }
}
