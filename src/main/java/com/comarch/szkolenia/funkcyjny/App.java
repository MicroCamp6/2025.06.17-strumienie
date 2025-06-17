package com.comarch.szkolenia.funkcyjny;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Janusz"));
        System.out.println(function.apply("Mateusz"));

        final String PART = "cos";

        UnaryOperator<String> unaryOperator = s -> s + PART;

        InterfejsFunkcyjny interfejsFunkcyjny = () -> System.out.println("abc");

        UnaryOperator<String> unaryOperator2 = new UnaryOperator<String>() {
            @Override
            public String apply(String string) {
                return string + PART;
            }
        };

        System.out.println(unaryOperator.apply("cos"));

        BiFunction<Integer, Integer, Double> biFunction = (i1,i2) -> {
            if(true) {
                //
            } else {
                //
            }

            for (int i = 0; i < 10; i++) {
                //
            }

            return 4.4;
        };

        System.out.println(biFunction.apply(15, 17));

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("jan"));
        System.out.println(predicate.test("mateusz"));

        Supplier<String> supplier = () -> "default";

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<String> consumer = System.out::println;

        consumer.accept("janusz");
        consumer.accept("mateusz");
        consumer.accept("wiesiek");

        TriFunction<Integer, Integer, Double, Double> triFunction = (x,y,z) -> (x + y) * z;

        IntTriFunction intTriFunction = (x,y,z) -> (x + y) * z;
    }
}
