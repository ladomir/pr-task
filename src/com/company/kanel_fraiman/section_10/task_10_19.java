package com.company.kanel_fraiman.section_10;

public class task_10_19 {
    /*
    Напишите класс, который генерирует и выводит на экран последовательность
    из 5 случайных целых чисел из диапазона от -50 до 50.
    Класс должен определить, сколько раз в этой последовательности менялся
    знак.
    Например: в последовательности 1, -34, 8, 14, -5 знак меняется 3 раза.
     */
    public static void main(String[] args) {
        int a, b, c, d, e, count = 0;

        a = (int) (Math.random() * 101 - 50);
            System.out.printf("Первое сгенерированное число - %d!\n", a);
        b = (int) (Math.random() * 101 - 50);
            System.out.printf("Второе сгенерированное число - %d!\n", b);
        c = (int) (Math.random() * 101 - 50);
            System.out.printf("Третье сгенерированное число - %d!\n", c);
        d = (int) (Math.random() * 101 - 50);
            System.out.printf("Четвёртое сгенерированное число - %d!\n", d);
        e = (int) (Math.random() * 101 - 50);
            System.out.printf("Пятое сгенерированное число - %d!\n", e);

        if (a*b<0)
            count++;
        if (b*c<0)
            count++;
        if (c*d<0)
            count++;
        if (d*e<0)
            count++;
        System.out.printf("Знак меняется %d раз(а)", count);
    }
}
