package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_21 {

    /*
    Напишите класс, который принимает с клавиатуры целое положительное число.
    Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех пор,
    пока не получится однозначное число. Все получающиеся значения следует вывести на экран.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, d, sum = 0, sumA = 0, sumB = 0;

        a = scanner.nextInt();

        while (a>0) {
            sum += a % 10;
            a /= 10;
        }
        b = sum;
            System.out.printf("Сумма цифр - %d", b);
        if (sum>9) {
            while (b>0) {
                sumA += b % 10;
                b /= 10;
            }
            c = sumA;
                System.out.printf("\nСумма цифр после первой замены - %d", c);
            if (sumA>9) {
                while (c>0) {
                    sumB += c % 10;
                    c /= 10;
                }
                d = sumB;
                    System.out.printf("\nСумма цифр после второй замены - %d", d);
            }
        } else {
            System.out.printf("\nСумма цифр изначально цифра - %d", b);
        }
    }
}
