package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_23 {
    /*
    Целое трехзначное число называется «дважды четным», если и сумма
    его цифр, и их произведение являются четными.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, является ли оно «дважды четным».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, sum, multi;
            System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        sum = a1 + a2 + a3;
        multi = a1 * a2 * a3;

        if (sum %2 == 0 && multi %2 == 0) {
            System.out.println("Число является \"дважды четным\"!");
        } else {
            System.out.println("Число НЕ является \"дважды четным\"!");
        }
    }
}
