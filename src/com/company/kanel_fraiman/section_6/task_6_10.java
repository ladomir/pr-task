package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_10 {
    /*
    Напишите программу (класс), которая принимает с клавиатуры двузначное
    число и проверяет, что больше: само это число или произведение
    его цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, b;
        System.out.println("Введите трёхначное число");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = a % 10;

        if (a > a1 * a2) {
            System.out.println("Введённое число больше произведения его цифр!");
        }
        if (a < a1 * a2) {
            System.out.println("Введённое число меньше произведения его цифр!");
        }
    }
}
