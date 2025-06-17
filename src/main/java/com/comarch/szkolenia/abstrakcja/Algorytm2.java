package com.comarch.szkolenia.abstrakcja;

public class Algorytm2 extends Algorytm {
    @Override
    public void loadData() {
        System.out.println("Pobieranie danych z internetu !!!");
    }

    @Override
    public void saveData() {
        System.out.println("Zapis do bazy !!!");
    }
}
