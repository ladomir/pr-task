package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_9 {
    /*
    Назовем "весом числа" сумму его цифр.
    Напишите класс, который принимает с клавиатуры число (двузначное)
    и выводит на экран его «вес».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

        b = a / 10;
        c = a % 10;
        d = b + c;

        System.out.println("Составные цифры - " + b + " и " + c + ", вес числа - " + d);
        System.out.printf("Составные цифры - %d и %d, вес числа - %d", b, c, d);
    }
}
