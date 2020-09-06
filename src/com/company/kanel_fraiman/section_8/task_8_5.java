package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_5 {
    /*
        Даны несколько словесных описаний оператора выбора.
        Для каждого из них напишите оператор выбора на языке Java.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        1. Если значение переменной х - положительное число, вывести на экран сообщение Плюс,
        иначе - вывести на экран сообщение Не плюс.
         */
        int x1;
            System.out.println("Введите значение x1:");
        x1 = scanner.nextInt();

        if (x1 > 0) {
            System.out.println("Плюс");
        } else {
            System.out.println("Не плюс");
        }

        /*
        2. Если значение переменной х больше значения переменной а, переменная а получает значение -1,
        иначе - переменная а получает значение 0.
         */
        int x2, a2;
            System.out.println("Введите значение x2:");
        x2 = scanner.nextInt();
            System.out.println("Введите значение a2:");
        a2 = scanner.nextInt();

        if (x2 > a2) {
            a2 = -1;
            System.out.println(a2);
        } else {
            a2 = 0;
            System.out.println(a2);
        }
        /*
        3. Если значение переменной а больше 100, вывести на экран сообщение Верное число,
        иначе - вывести на экран сообщение Ошибка.
         */
        int a3;
            System.out.println("Введите значение a3:");
        a3 = scanner.nextInt();

        if (a3 > 100) {
            System.out.println("Верное число");
        } else {
            System.out.println("Ошибка");
        }

        /*
        4. Если значения переменных а и х - не одинаковы, переменная а получает значение переменной х,
        иначе - переменная х получает удвоенное значение переменной а.
         */
        int x4, a4;
        System.out.println("Введите значение x4:");
            x4 = scanner.nextInt();
        System.out.println("Введите значение a4:");
            a4 = scanner.nextInt();

        if (a4 != x4) {
            a4 = x4;
            System.out.println(a4);
        } else {
            x4 = 2 * a4;
            System.out.println(x4);
        }
        /*
        5. Если переменная х содержит положительное значение, увеличить ее значение на 1,
        иначе - уменьшить ее значение на 1.
         */
        int x5;
            System.out.println("Введите значение x5:");
        x5 = scanner.nextInt();

        if (x5 > 0) {
            x5++;
            System.out.println(x5);
        } else {
            x5--;
            System.out.println(x5);
        }

    }
}
