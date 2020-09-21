package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_17 {
    /*
    Трехзначное число называется «дважды четным», если и оно само, и
    сумма его цифр - четные.
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, является ли оно «дважды четным».
    В соответствии с результатом проверки надо вывести на экран соответствующее
    текстовое сообщение.
    Обратите внимание: задание имеет решение с использованием единственного
    оператора if- без составного условия!
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, b;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;
        b = a % 2;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b);



        if (a % 2 != 1 && (a1 + a2 + a3) != 1) {
            System.out.println("Введённое число \"дважды чётное\"!");
        } else {
            System.out.println("Введённое число не является \"дважды чётным\"!");
        }
    }
}
