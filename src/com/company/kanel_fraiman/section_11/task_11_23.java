package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_23 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное
    число (в переменную х), которое будет количеством членов
    в арифметической прогрессии.
    Первый член прогрессии равен 7, а разница между соседними членами
    прогрессии равна 4.
    Затем класс выводит на экран в строку серию из х членов этой прогрессии.
    Числа должны отделяться друг от друга знаком «пробел». Перед началом
    и после окончания вывода серии чисел на экран вывода следует
    вывести текстовые сообщения (по выбору).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите количество членов прогресси a:");
        a = scanner.nextInt();

            System.out.println("Отображение целых чисел: ");
        for (int i = 7; i < ((a+1)*4); i+=4) {
            System.out.print(i + " ");
        }
            System.out.println("\nВсе числа отображены.");
    }
}
