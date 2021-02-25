package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_11_29 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное число.
    Затем класс выводит на экран в строку положительные трехзначные числа,
    в которых последняя цифра такая же, как и последняя цифра в значении,
    введенном с клавиатуры. Числа должны отделяться друг от друга знаком «пробел».
    Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, i1, i2, i3;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

            System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            if (i3==a) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
