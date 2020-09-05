package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_33 {
    /*
    Напишите класс,
    который принимает с клавиатуры три числа:
    значения оснований трапеции и ее высоту.
    Класс должен подсчитать и вывести на экран площадь этой трапеции.
    S = 0.5 * (a + b) * h;
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, h, S;
            System.out.println("Введите значение основания трапеции a:");
        a = scanner.nextDouble();
            System.out.println("Введите значение основания трапеции b:");
        b = scanner.nextDouble();
            System.out.println("Введите значение высоты трапеции h:");
        h = scanner.nextDouble();

        S = 0.5 * (a + b) * h;
        System.out.println("значение основания трапеции a равно " + a + ";");
        System.out.println("значение основания трапеции a равно " + b + ";");
        System.out.println("значение высоты трапеции h равно " + h + ";");
        System.out.println("площадь трапеции равна " + S + ";");
        System.out.printf("значение оснований трапеции a и b равно %.2f и %.2f соответственно, " +
                "значение высоты равно %.2f, площадь - %.2f.", a, b, h, S);
    }
}
