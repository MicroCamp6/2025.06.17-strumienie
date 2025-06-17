package com.comarch.szkolenia.strumienie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,1,0,4,-5,5,0,6,7,8,-20,9,1,0);

        list.stream()
                .map(i -> "Liczba: " + i)
                .forEach(System.out::println);
    }

    public static void funkcja(int i) {
        System.out.println("To moja funkcja");
        System.out.println("Teraz robie jakies operacje");
        System.out.println(i);
    }
}
