package com.comarch.szkolenia.strumienie;

import java.util.List;

/*
Mamy liste intów
szykamy tylko wiekszych od 3 i mniejszych od 10
nie interesują nas duplikaty
chemy dostać czwartą liczbę
 */
public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> liczby = List.of(4,2,65,4,56,8,5,56,98,5,9,8,5,98,8,65,8,54,65,9,56,87,56,6);

        liczby.stream()
                .filter(i -> i > 3)
                //.peek(System.out::println)
                .filter(i -> i < 10)
                //.peek(System.out::println)
                .distinct()
                //.peek(System.out::println)
                .skip(3)
                //.peek(System.out::println)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
