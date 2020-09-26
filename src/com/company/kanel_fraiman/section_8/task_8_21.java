package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_21 {
    /*
    Напишите класс, который принимает с клавиатуры положительное
    целое число и выводит на экран ближайшее к нему «круглое число».
    Например, для введенного значения 433 выводится на экран 430, а для
    56 выводится 60.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c = 0;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();

        b = a % 10;

        if (b < 5) {
            c = (a / 10) * 10;
        } else {
            c = (a / 10 + 1) * 10;
        }
        System.out.println(c);
    }
}
