package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_28 {
    /*
    Напишите класс, который принимает с клавиатуры положительное трехзначное
    число и проверяет, сколько одинаковых цифр оно содержит.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, count = 1;
            System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        if (a1 == a2) {
            count++;
        }
        if (a1 == a3) {
            count++;
        }
        if (a1 != a2 && a1 != a3) {
            System.out.println("Все цифры разные");
        }
        System.out.printf("Одинаковых цифр - %d", count);
    }
}
