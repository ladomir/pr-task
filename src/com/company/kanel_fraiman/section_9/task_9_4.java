package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_4 {
    /*
    «Красивое» число - это целое число между 40 и 100 (включительно).
    Цель следующих четырех фрагментов - проверка, является ли целое число
    number «красивым».

    1. Для каждого фрагмента отметьте, выполняет ли он поставленную задачу.
    2. Для фрагмента, который НЕ выполняет поставленную задачу,
    приведите пример, доказывающий его ошибочность.
    Фрагмент выполняет поставленную задачу, если он печатает сообщение
    Да для всех «красивых» чисел и сообщение Нет для всех остальных чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
            System.out.println("Введите число number:");
        number = scanner.nextInt();

        if (number >= 40 || number <= 100) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        if (number >= 40 && number <= 100) { // number = 39
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        if (number > 40 || number < 100) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        if (number > 39 || number < 101) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
