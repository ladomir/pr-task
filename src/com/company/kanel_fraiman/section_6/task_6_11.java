package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_11 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа и,
    если оба имеют одинаковый знак, на экран выводится сообщение
    Один и тот же знак, а если разный, то на экран выводится сообщение
    Разные знаки. Если же хотя бы одно из чисел равно 0, выводится сообщение
    Некорректно.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите число");
        a = scanner.nextInt();
            System.out.println("Введите число");
        b = scanner.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Один и тот же знак!");
        }
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            System.out.println("Разные знаки!");
        }
        if ((a == 0 || b == 0)) {
            System.out.println("Некорректно!");
        }
    }
}
