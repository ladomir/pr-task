package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_13 {
    /*
    Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, составлено ли оно из одинаковых цифр.
    В соответствии с результатом проверки надо вывести на экран соответствующее
    текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();

        a1 = a / 10;
        a2 = a % 10;

        if (a1 == a2) {
            System.out.println("Введённое двухзначное число составлено из одинаковых цифр!");
        } else {
            System.out.println("Введённое двухзначное число составлено из разных цифр!");
        }
    }
}
