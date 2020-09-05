package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_8 {
    /*
    Напишите класс, который принимает с клавиатуры два значения:
    первое - длина основания равнобедренного треугольника,
    второе - высоту этого треугольника.
    Затем класс должен подсчитать и вывести на экран:
        • площадь этого треугольника;
        • периметр прямоугольника, сторонами которого являются основание и высота описанного в задаче треугольника;
        • периметр равнобедренного треугольника.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, h, b, c, S, p, P;
            System.out.println("Введите значение длины основания равнобедренного треугольника:");
        a = scanner.nextInt();
            System.out.println("Введите значение высоты равнобедренного треугольника:");
        h = scanner.nextInt();
            System.out.println("длина основания равнобедренного треугольника равна " + a);
            System.out.println("высота равнобедренного треугольника равна " + h);
        S = 0.5 * a * h;
        b = (double) Math.sqrt((0.5 * a) * (0.5 * a) + (h * h));
        c = (double) Math.sqrt(Math.pow((0.5 * a), 2) + Math.pow(h, 2));
        p = 0.5 * a + h + b;
        P = a + b + c;
        System.out.println(b  + ", " + c);
        System.out.println(S + ", " + p  + ", " + P);
        System.out.printf("Площадь равнобедренного треугольника равна - %.2f;\n" +
                "периметр прямоугольного треугольника равен - %.2f;\n" +
                "периметр равнобедренного треугольника равен - %.2f.", S, p, P);
    }
}
