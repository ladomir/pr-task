package com.company.Tasks_Template.SummaCifr;

import java.util.Scanner;

public class SummaCifr {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число.
    Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех пор,
    пока не получится однозначное число. Все получающиеся значения следует вывести на экран.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, sum = 0;

        a = scanner.nextInt();

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
}
