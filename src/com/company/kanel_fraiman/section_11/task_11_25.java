package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_25 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку все целые числа из диапазона O ... |x| (включая крайние значения
    диапазона). Числа должны отделяться друг от друга знаком «пробел».
    Перед началом и после окончания вывода серии чисел на экран вывода
    следует вывести текстовые сообщения (по выбору).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

        if (a < 0) {
            a = -a;
        }
            System.out.println("Отображение целых чисел: ");
        for (int i = 0; i < (a+1); i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nВсе числа отображены.");
    }
}