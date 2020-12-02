package com.company.kanel_fraiman.section_10;

public class task_10_7 {
    /*
    Напишите класс, который генерирует два случайных положительных двузначных
    числа, обозначающих границы некоторого интервала, а затем
    генерирует три целых положительных числа внутри данного интервала.
     */
    public static void main(String[] args) {
        int a, b, c, d, e;

        a = (int)(Math.random()*90+10);
        b = (int)(Math.random()*90+10);

        System.out.printf("Сгенерированые границы интервалов равны - %d и %d\n", a, b);

        if (a < b) {
            c = (int)(Math.random()*(b-a)+a);
            d = (int)(Math.random()*(b-a)+a);
            e = (int)(Math.random()*(b-a)+a);
            System.out.printf("Сгенерированные числа c, d и e внутри заданого интервала равны %d, %d и %d соответственно.", c, d, e);
        } else {
            c = (int)(Math.random()*(a-b)+b);
            d = (int)(Math.random()*(a-b)+b);
            e = (int)(Math.random()*(a-b)+b);
            System.out.printf("Сгенерированные числа c, d и e внутри заданого интервала равны %d, %d и %d соответственно.", c, d, e);
        }


    }
}
