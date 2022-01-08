package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_21_c {
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
            System.out.printf("Сумма цифр - %d", sum);
            System.out.println();
            if (sum >= 10) {
                a = sum;
                sum = 0;
            }
        }
    }
}
