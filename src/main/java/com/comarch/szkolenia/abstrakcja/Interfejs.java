package com.comarch.szkolenia.abstrakcja;

public interface Interfejs {
    void metoda();

    default void metodaDomyslna() {
        System.out.println("metoda domyslna !!");
    }
}
