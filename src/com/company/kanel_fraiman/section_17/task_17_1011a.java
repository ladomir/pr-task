package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_1011a {
    /*
    Напишите метод, который принимает в качестве параметров целое число и возвращает сумму и количество его цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, d;

        a = b =scanner.nextInt();

        c = sumNumber(a);
        d = amount(b);
        System.out.printf("\nСумма цифр числа - %d, количество - %d", c, b);
    }
    public static int sumNumber (int a) { // метод, который определяет сумму цифр числа
        int sum = 0;
        while (a > 0) {
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }

            if (sum >= 10) {
                a = sum;
                sum = 0;
            }
        }
        return sum;
    }
    public static int amount(int b) { // метод, который определяет количество цифр числа
        int count = 0;
        while (b>0) {
            count++;
            b /= 10;
        }
        return count;
    }
}
