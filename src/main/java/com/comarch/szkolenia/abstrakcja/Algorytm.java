package com.comarch.szkolenia.abstrakcja;

public abstract class Algorytm {

    public void calculate() {
        loadData();
        k1();
        k2();
        k3();
        saveData();
    }

    public abstract void loadData();

    private void k1() {
        System.out.println("krok 1 !!");
    }

    private void k2() {
        System.out.println("krok 2 !!");
    }

    private void k3() {
        System.out.println("krok 3 !!");
    }

    public abstract void saveData();
}
