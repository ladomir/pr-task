package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_11 {
    /*
        Напишите класс, который принимает с клавиатуры пары двузначных целых чисел,
    пока не будет введена пара одинаковых чисел.
        Класс должен выводить на экран сумму всех первых чисел в парах и сумму всех вторых чисел в парах
    (не считая чисел, введенных в последней паре).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, sumA = 0, sumB = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        while (a != b) {
            sumA += a;
            sumB += b;
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.printf("Сумма всех первых чисел равна - %d, всех вторых - %d", sumA, sumB);
    }
}
