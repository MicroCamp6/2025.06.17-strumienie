package com.comarch.szkolenia.strumienie;

import java.util.List;

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
    }
}
