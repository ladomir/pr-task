package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_30 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное число.
    Затем класс выводит на экран в строку положительные двузначные числа,
    произведение цифр которых меньше введенного с клавиатуры значения.
    Числа должны отделяться друг от друга знаком «пробел».
    Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, i1, i2;
        System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
        for (int i = 10; i < 100; i++) {
            i1 = i / 10;
            i2 = i % 10;
            if (i1*i2==a) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
