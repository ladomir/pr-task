package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_24 {
    /*
    Напишите класс, который вначале принимает с клавиатуры целое положительное число (в переменную х).
    Затем класс выводит на экран в строку серию из 2х убывающих чисел, начиная с 0;
    разница между соседними значениями в серии равна 8.
    Числа должны отделяться друг от друга знаком «пробел».
    Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

            System.out.println("Отображение целых чисел: ");

            System.out.println(a);
        for (int i = 0; i > (-1*2*8); i-=8) {
            System.out.print(i + " ");
        }
            System.out.println("\nВсе числа отображены.");
    }
}
