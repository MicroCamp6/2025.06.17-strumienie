package com.comarch.szkolenia.strumienie;

import java.util.Arrays;
import java.util.List;

/* Mamy liste imion.
Usuń wszystkie imiona zaczynające się na "A" i wypisz wszystkie pozostałe imiona
w kolejności alfabetycznej tylko małymi literami.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        List<String> imiona = List.of(
                "Ania",
                "Wiesiek",
                "Adam",
                "Karol",
                "Zbyszek",
                "Alfred",
                "Mateusz"
        );

        imiona.stream()
                .filter(imie -> !imie.startsWith("A"))
                .sorted()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
