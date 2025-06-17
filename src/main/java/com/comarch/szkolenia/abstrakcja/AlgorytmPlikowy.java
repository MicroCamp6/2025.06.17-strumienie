package com.comarch.szkolenia.abstrakcja;

public class AlgorytmPlikowy extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("pobieranie danych z pliku !!!");
    }

    @Override
    public void saveData() {
        System.out.println("Zapis do pliku !!!");
    }
}
