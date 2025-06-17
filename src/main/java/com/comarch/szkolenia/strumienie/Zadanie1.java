package com.comarch.szkolenia.strumienie;

import java.util.List;

/*
Mamy liste liczb. Chce wypisać na ekranie tylko trzy pierwsze parzyste liczby.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(43,43,65,3,2,75,45,47,5,34,16,76,58,34,83,56,42,7,3,5);

        /*****************************************/
        long startTime = System.nanoTime();
        int counter = 0;
        for(int liczba : list) {
            if(liczba % 2 == 0) {
                System.out.println(liczba);
                counter++;
            }
            if(counter >= 3) {
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        /*********************************************/
        long startTime2 = System.nanoTime();
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);
    }
}
