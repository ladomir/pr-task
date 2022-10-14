package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_14b {
    /*
    Напишите метод, который принимает в качестве параметра два целых числа и возвращает среднее арифметическое сумм цифр в этих числах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        sumNumberA(a);
        sumNumberB(b);
        average(a,b);
    }

    public static void sumNumberA (int a) {
        int sumA = 0;
        while (a > 0) {
            while (a > 0) {
                sumA += a % 10;
                a /= 10;
            }
        }
        System.out.printf("\nСумма цифр числа A равна %d", sumA);
    }

    public static void sumNumberB (int b) {
        int sumB = 0;
        while (b > 0) {
            while (b > 0) {
                sumB += b % 10;
                b /= 10;
            }
        }
        System.out.printf("\nСумма цифр числа B равна %d", sumB);
    }

    public static void average (int sumNumberA, int sumNumberB) { // среднее арифметическое
        double c = (double) (sumNumberA+sumNumberB)/2;
        System.out.println("\nСреднее арифметическое чисел А и В равно " + c);
    }
}
