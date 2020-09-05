package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_10 {
    /*
    Назовем «весом числа>> сумму· его цифр.
    Напишите класс, который принимает с клавиатуры число (трехзначное)
    и выводит на экран его «вес».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, sum;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        sum = b + c + d;

        System.out.println("Составные цифры - " + b + ", " + c + " и " + d + ", вес числа - " + sum);
        System.out.printf("Составные цифры - %d, %d и %d, вес числа - %d", b, c, d, sum);
    }
}
