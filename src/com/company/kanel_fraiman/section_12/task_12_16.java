package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_16 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число и определяет, является ли оно простым.
    Класс должен вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, x, count = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();

        for (i = 2; i < x; i++) {

            if (x%i == 0) {
                System.out.println("Введённое число НЕ является простым!");
            } else {
                System.out.println("Введённое число является простым!");
            }
        }
        System.out.println();
    }
}
