package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_5 {
    /*
    Напишите класс, который принимает с клавиатуры три числа:
    длины двух катетов и гипотенузы прямоугольного треугольника,
    и выводит на экран площадь и периметр этого треугольника.
    При решении следует предусмотреть возможность того,
    что размеры сторон треугольника не выражаются целыми числами.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, P, S;
            System.out.println("Введите значения длин прямоугольного треугольника:");
            System.out.println("длина катета a:");
        a = scanner.nextDouble();
            System.out.println("длина катета b:");
        b = scanner.nextDouble();
            System.out.println("длина гипотенузы c:");
        c = scanner.nextDouble();
            System.out.println("Значения длин прямоугольного треугольника равны " + a + " см, " + b + " см и " + c + " см.");

        P = a + b + c;
        S = 0.5 * a * b;
            System.out.println("Периметр прямоугольного треугольника равен " + P + " см, а площадь - " + S + " квадратных см.");
        System.out.printf("Периметр прямоугольного треугольника равен %.2f см, а площадь - %.2f квадратных см.", P, S);
    }
}
