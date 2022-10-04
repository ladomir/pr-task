package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_1011 {
    /*
    Напишите метод, который принимает в качестве параметров целое число и возвращает сумму и количество его цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        sumNumber(a);
        amount(a);
    }
    static void sumNumber(int a) { // метод, который определяет сумму цифр числа
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
        System.out.printf("\nОкончательная сумма цифр - %d", sum);
    }
    static void amount(int a) { // метод, который определяет количество цифр числа
        int count = 0;
        while (a>0) {
            count++;
            a /= 10;
        }
        System.out.println("\nКоличество цифр числа - " + count);
    }
}
