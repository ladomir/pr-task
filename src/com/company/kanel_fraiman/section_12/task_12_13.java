package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_13 {
    /*
    Для того чтобы проверить утверждение «орел и решка, при подбрасывании монеты,
    выпадают примерно одинаковое количество раз»,
    ученик подбросил монету сначала 10, потом 100, потом 1000 раз.
    В каждой серии он записывал, сколько раз выпадала «решка», сколько - «орел».
    Напишите класс, который моделирует эти три серии
    и для каждой подсчитывает количество выпадений «орла» и количество выпадений «решки»,
    и выводит на экран абсолютное и относительное значение разницы между этими количествами.
     */
    public static void main(String[] args) {

        int count10SeriesO = 0, count10SeriesR = 0;
        int count100SeriesO = 0, count100SeriesR = 0;
        int count1000SeriesO = 0, count1000SeriesR = 0;
        int count10Series_PO = 0, count10Series_PR = 0;
        int count100Series_PO = 0, count100Series_PR = 0;
        float count1000Series_PO = 0, count1000Series_PR = 0;

        int[] A10array = new int[10];
        int[] A100array = new int[100];
        int[] A1000array = new int[1000];

        for(int i = 0; i < A10array.length; i++) {
            A10array[i] = (int)(Math.random()*2);
                System.out.print(A10array[i] + "\t");
            if (A10array[i] == 0) {
                count10SeriesO++;
            }
            if (A10array[i] == 1) {
                count10SeriesR++;
            }
            count10Series_PO = count10SeriesO * 10;
            count10Series_PR = count10SeriesR * 10;
        }

        for(int i = 0; i < A100array.length; i++) {
            A100array[i] = (int)(Math.random()*2);
            System.out.print(A100array[i] + "\t");
            if (A100array[i] == 0) {
                count100SeriesO++;
            }
            if (A100array[i] == 1) {
                count100SeriesR++;
            }
            count100Series_PO = count100SeriesO;
            count100Series_PR = count100SeriesR;
        }

        for(int i = 0; i < A1000array.length; i++) {
            A1000array[i] = (int)(Math.random()*2);
            System.out.print(A1000array[i] + "\t");
            if (A1000array[i] == 0) {
                count1000SeriesO++;
            }
            if (A1000array[i] == 1) {
                count1000SeriesR++;
            }
            count1000Series_PO = (float)count1000SeriesO / 10;
            count1000Series_PR = (float)count1000SeriesR / 10;
        }

        System.out.printf("\n\tСерия из 10 подбрасываний монеты: " +
                "\nАбсолютное соотношение: " +
                "\n\t- количество выпадений орла равно - %d, решки - %d", count10SeriesO, count10SeriesR);
        System.out.printf("\nОтносительное соотношение: " +
                "\n\t- процент выпадений орла равно - %d, решки - %d", count10Series_PO, count10Series_PR);

        System.out.printf("\n\n\tСерия из 100 подбрасываний монеты: " +
                "\nАбсолютное соотношение: " +
                "\n\t- количество выпадений орла равно - %d, решки - %d", count100SeriesO, count100SeriesR);
        System.out.printf("\nОтносительное соотношение: " +
                "\n\t- процент выпадений орла равно - %d, решки - %d", count100Series_PO, count100Series_PR);

        System.out.printf("\n\n\tСерия из 1000 подбрасываний монеты: " +
                "\nАбсолютное соотношение: " +
                "\n\t- количество выпадений орла равно - %d, решки - %d", count1000SeriesO, count1000SeriesR);
        System.out.printf("\nОтносительное соотношение: " +
                "\n\t- процент выпадений орла равно - %.1f, решки - %.1f", count1000Series_PO, count1000Series_PR);
    }
}
