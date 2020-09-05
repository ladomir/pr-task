package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_6 {
    /*
    Напишите класс,
    который принимает с клавиатуры два числа и проверяет, равны они друг другу или нет.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите число a");
        a = scanner.nextInt();
            System.out.println("Введите число b");
        b = scanner.nextInt();
        if (a == b) {
            System.out.println("Числа равны!");
        } else {
            System.out.println("Числа не равны!");
        }
    }
}
