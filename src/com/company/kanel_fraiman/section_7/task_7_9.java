package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_9 {
    /*
    Напишите класс, который принимает с клавиатуры три числа: два первых
    должны быть длинами сторон катетов прямоугольного треугольника,
    а третье - длиной гипотенузы. Программа должна проверить,
    соответствуют ли введенные значения этому требованию.
    Внимание: допустимо предположить, что все вводимые чиО1а - положительные.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
            System.out.println("Введите значение длины первого катета");
        a = scanner.nextDouble();
            System.out.println("Введите значение длины второго катета");
        b = scanner.nextDouble();
            System.out.println("Введите значение длины гипотенузы");
        c = scanner.nextDouble();
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            System.out.println("Введённые значения соответствуют требованиям!");
        } else {
            System.out.println("Введённые значения не соответствуют требованиям!");
        }
    }
}
