package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_14a {
    /*
    Напишите метод, который принимает в качестве параметра два целых числа и возвращает среднее арифметическое сумм цифр в этих числах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, x, y;

        a = scanner.nextInt();
        b = scanner.nextInt();

        x = sumNumberA(a);
        y = sumNumberB(b);
            System.out.printf("\nСумма цифр числа A - %d, числа B - %d", x, y);
            System.out.println("\nСреднее арифметическое чисел А и В равно " + average(x,y));
    }
    public static int sumNumberA (int a) {
        int sum = 0;
        while (a > 0) {
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
        }
        return sum;
    }
    public static int sumNumberB (int b) {
        int sum = 0;
        while (b > 0) {
            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
        }
        return sum;
    }
    public static double average (int x, int y) { // среднее арифметическое
        double c = (double) (x+y)/2;
        return c;
    }
}
