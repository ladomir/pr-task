package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_21 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х). Затем класс выводит на экран в
    строку серию из 17 целых положительных чисел, отвечающую следующим
    условиям:
    1) серия начинается с числа, большего хна 1;
    2) каждое число в серии (начиная со второго) больше предьщущего на 1.
    Числа должны отделяться друг от друга знаком «пробел». Перед началом
    и после окончания вывода серии чисел на экран вывода следует
    вывести текстовые сообщения (по выбору).
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

            System.out.println("Отображение целых чисел: ");
        for (int i = (a+1); i <= (a+17); i++) {
            System.out.print(i + " ");
        }
            System.out.println("\nВсе числа отображены.");
    }
}
