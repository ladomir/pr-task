package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_17 {
    /*
    Напишите класс, который принимает с клавиатуры три числа и проверяет,
    являются ли эти числа углами одного и того же треугольника.
    По результатам проверки следует вывести на экран соответствующее
    текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();
            System.out.println("Введите целое число c:");
        c = scanner.nextInt();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Числа могут являться длинами сторон треугольника");
        } else {
            System.out.println("Числа НЕ могут являться длинами сторон треугольника");
        }
    }
}
