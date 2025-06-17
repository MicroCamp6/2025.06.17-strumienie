package com.comarch.szkolenia.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Interfejs interfejs = new Interfejs() {
            @Override
            public void a() {
                System.out.println("metoda a !!!");
            }

            @Override
            public void b() {
                System.out.println("metoda b !!!");
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(56);
        list.add(2);
        list.add(78);
        list.add(2);
        list.add(45);
        list.add(7);
        list.add(678);
        list.add(324);

        Collections.sort(list, (o1, o2) -> o1 - o2);

        System.out.println(list);

        KlasaAbstrakcyjna klasaAbstrakcyjna = new KlasaAbstrakcyjna() {
            @Override
            void metodaAbstrakcyjna() {
                System.out.println("metoda abstrakcyjna !!");
            }
        };

        Random random = new Random();

        klasaAbstrakcyjna.x = 7;
        klasaAbstrakcyjna.metoda();
        klasaAbstrakcyjna.metodaAbstrakcyjna();
    }
}
