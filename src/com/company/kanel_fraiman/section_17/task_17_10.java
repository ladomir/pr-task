package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_10 {
    /*
    Напишите метод, который принимает в качестве параметров целое число и возвращает сумму его цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        sumNumber(a);
    }
    static void sumNumber(int a) {
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
        System.out.printf("\nСумма цифр числа - %d", sum);
    }
}
