package com.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        List<Car> list = List.of(
                new Car("Toyota", "Corolla"),
                new Car("Audi", "A5"),
                new Car("BMW", "3"),
                new Car("Kia", "Ceed")
        );

        list.stream()
                .peek(c -> c.setModel("X"))
                .forEach(System.out::println);

        System.out.println(list);

        List<Integer> list2 = List.of(1,2,3,4,5);

        list2.stream()
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);

        List<String> strings = List.of(
                "janusz",
                "jakis string",
                "jak, asdf",
                "asdOasd",
                "asdASD asd",
                "asdf.asd",
                "asdf.asdf,asdf",
                "Asdf.asdf",
                "fasd.asdf asdf",
                "asdf, asdf",
                "asdASD,Aasdf"
        );

        double result = strings.stream()
                .filter(s -> s.equals(s.toLowerCase()))
                .filter(s -> !s.contains(" "))
                .map(s -> s.replaceAll("[\\.,]", ""))
                .mapToInt(String::length)
                .average()
                .getAsDouble();

        System.out.println(result);

    }
}
