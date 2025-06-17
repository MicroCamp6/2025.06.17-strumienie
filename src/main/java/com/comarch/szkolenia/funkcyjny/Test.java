package com.comarch.szkolenia.funkcyjny;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        calculateAndSave(Test::calculate1, Test::saveToDb);
        calculateAndSave(Test::calculate2, Test::saveToDb);
        calculateAndSave(Test::calculate1, Test::saveToFile);
        calculateAndSave(Test::calculate2, Test::saveToFile);
    }

    private static int calculate1() {
        return 5;
    }

    private static int calculate2() {
        return 7;
    }

    private static void saveToDb(int x) {
        System.out.println("zapisuje " + x + " do bazy !!");
    }

    private static void saveToFile(int x) {
        System.out.println("zapisuje " + x + " do pliku !!");
    }

    public static void calculateAndSave(Supplier<Integer> calculateMethod, Consumer<Integer> saver) {
        int x = calculateMethod.get();
        saver.accept(x);
    }
}
