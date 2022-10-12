package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_14 {
    /*
    Напишите метод, который принимает в качестве параметра два целых числа и возвращает среднее арифметическое сумм цифр в этих числах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        double c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();

        average(a,b);
    }

    public static void average (int a, int b) { // среднее арифметическое

        int sumA = 0;
        while (a > 0) {
            while (a > 0) {
                sumA += a % 10;
                a /= 10;
            }
        }
        int sumB = 0;
        while (b > 0) {
            while (b > 0) {
                sumB += b % 10;
                b /= 10;
            }
        }

        double c = (double) (sumA+sumB)/2;
        System.out.println("\nСреднее арифметическое чисел А и В равно " + c);
    }
}
