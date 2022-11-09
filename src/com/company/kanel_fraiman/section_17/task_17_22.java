package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_22 {
    /*
    Напишите метод, который принимает в качестве параметра коэффициенты квадратного уравнения (а, b и с) и
    возвращает значение true, если уравнение имеет хотя бы одно решение (корень).
    В ином случае метод возвращает значение false.
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

        quadraticEduation(a,b,c);
    }

    public static void quadraticEduation(double a, double b, double c) {
        double D = Math.pow(b, 2) - 4*a*c;
        double x1 = (-b+Math.sqrt(D))/2*a;
        double x2 = (-b-Math.sqrt(D))/2*a;
        if (D>=0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
