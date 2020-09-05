package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_23 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых числа
    и выводит на экран следующие значения (каждое в отдельной строке):
    квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, f;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b:");
        b = scanner.nextInt();
            System.out.printf("Введённые числа:\na = %d;\nb= %d", a, b);
        c = a * a;
        d = b * b;
        e = c + d;
        f = (int)(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("\nКвадрат числа a равен " + c);
        System.out.println("Квадрат числа a равен " + d);
        System.out.println("Сумма квадратов чисел a и b равна " + e);
        System.out.println("Сумма квадратов чисел a и b равна " + f);
        System.out.printf("%d\n%d\n%d\n%d", c, d, e, f);
    }
}
