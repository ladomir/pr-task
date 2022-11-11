package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_23a {
    /*
    Напишите метод, который принимает в качестве параметров коэффициенты квадратного уравнения (а, Ь и с)
    и возвращает количество решений этого уравнения.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double a, b, c;

            System.out.println("Введите значение a");
        a = scanner.nextDouble();

            System.out.println("Введите значение b");
        b = scanner.nextDouble();

            System.out.println("Введите значение c");
        c = scanner.nextDouble();

            System.out.println(quadraticEduation(a,b,c));
    }

    public static String quadraticEduation(double a, double b, double c) {
        double D = Math.pow(b, 2) - 4*a*c;
        double x1 = (-b+Math.sqrt(D))/2*a;
        double x2 = (-b-Math.sqrt(D))/2*a;
        if (D > 0) {
            return "Уравнение имеет два корня";
        } else if (D == 0) {
            return "Уравнение имеет один корень";
        } else {
            return "Уравнение корней не имеет";
        }
    }
}
