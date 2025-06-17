package com.comarch.szkolenia.abstrakcja;

public abstract class KlasaAbstrakcyjna {
    private int x;

    public KlasaAbstrakcyjna(int x) {
        this.x = x;
    }

    public void metoda() {
        System.out.println("zwykla metoda !!");
    }

    abstract void metodaAbstrakcyjna();
}
