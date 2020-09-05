package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_16 {
    /*
    Назовем «перестановкой» операцию над числом,
    при которой его первая и последняя цифры меняются местами.
    Например, из числа 1234 получается число 4231.
    Напишите программу, которая принимает с клавиатуры трехзначное число и
    строит из него новое число методом «перестановки».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e;
        System.out.println("Введите четырёхзначное число:");
        a = scanner.nextInt();
        System.out.println("Введённое четырёхзначное число - " + a);

        b = a / 1000;
        c = (a % 1000) / 100;
        d = (a % 100) / 10;
        e = a % 10;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("Четырёхзначное число после операции перестановки " + e + "" + c + "" + "" + d + b);
        System.out.printf("Четырёхзначное число после операции перестановки %d%d%d%d ", e, c, d, b);
    }
}
