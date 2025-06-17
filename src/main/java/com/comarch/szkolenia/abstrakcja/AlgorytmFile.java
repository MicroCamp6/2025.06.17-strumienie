package com.comarch.szkolenia.abstrakcja;

public class AlgorytmFile {

    public void calculate() {
        loadData();
        k1();
        k2();
        k3();
        saveData();
    }

    private void loadData() {
        System.out.println("Wczytywanie danych z pliku !!");
    }

    private void k1() {
        System.out.println("krok 1 !!");
    }

    private void k2() {
        System.out.println("krok 2 !!");
    }

    private void k3() {
        System.out.println("krok 3 !!");
    }

    private void saveData() {
        System.out.println("Zapis danych do pliku !!");
    }
}
