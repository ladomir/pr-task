package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_5 {
    /*
    На каждом этаже многоэтажного дома расположены три квартиры;
    счет квартир идет слева направо. Например, на первом этаже квартира
    № 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
    справа, и так далее.
    Напишите класс, который принимает с клавиатуры номер квартиры и выводит
    на экран следующую информацию: на каком этаже она расположена,
    и какое место (слева, справа или в центре) она занимает на этом этаже.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number, e, n;
            System.out.println("Введите номер квартиры:");
        number = scanner.nextInt();

        // определяем этаж, на котором размещена квартира
        e = (number - 1 ) / 3 + 1;

        /*
        используем формулу для последовательности с шагом 3 (3 квартиры на этаже)
        an = a1 + d (n − 1),
        преобразуем для нашего случая:
        n + 3 (e - 1) = number
        находим значение a1:
        n = number - 3 (e - 1)
         */
        n = number - 3 * (e - 1);

        if(n==1) {
            System.out.printf("Квартира расположена слева на %d этаже", e);
        }
        if(n==2) {
            System.out.printf("Квартира расположена в центре на %d этаже", e);
        }
        if(n==3) {
            System.out.printf("Квартира расположена справа на %d этаже", e);
        }

    }
}
