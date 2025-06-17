package com.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        Interfejs i = new KlasaImplementujacaIntefejs();
        i.metoda();

        KlasaAbstrakcyjna ka = new KlasaDziedziczacaPoKlasieAbstrakcyjnej(6);
        ka.metodaAbstrakcyjna();

        Algorytm algorytm = new AlgorytmPlikowy();
        algorytm.calculate();

        AlgorytmFile algorytmFile = new AlgorytmFile();
        algorytmFile.calculate();

        Algorytm algorytm2 = new Algorytm2();
        algorytm2.calculate();
    }
}
