package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_4 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное трехзначное число и
    выводит на экран его цифры, разделенные знаком «пробел», но в обратном порядке.
    То есть для числа 415 будет выведено на экран 5 1 4.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;

        System.out.println(d + " " + c + " " + b);
        System.out.printf("%d %d %d", d, c, b);
    }
}
