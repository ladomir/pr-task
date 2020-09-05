package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_6 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и
    выводит на экран одно из следующих сообщений:
    Положительное, или Отрицательное, или Ноль, - в зависимости от значения числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число");
        a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Положительное");
        }
        if (a < 0) {
            System.out.println("Отрицательное");
        }
        if (a == 0) {
            System.out.println("Ноль");
        }
    }
}
