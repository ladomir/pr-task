package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_24 {
    /*
    Напишите метод, который принимает в качестве параметров два параметра линейной функции (а и b, для уравнения у=ах+Ь),
    а также координаты точки на плоскости (х и у). Метод возвращает значение true,
    если точка лежит на графике функции; в ином случае метод возвращает значение false.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int k, b, x, y;

            System.out.println("Введите значение k");
        k = scanner.nextInt();

            System.out.println("Введите значение b");
        b = scanner.nextInt();

            System.out.println("Введите значение координаты x");
        x = scanner.nextInt();

            System.out.println("Введите значение координаты y");
        y = scanner.nextInt();

        linearEquation(k,b,x,y);
    }

    public static void linearEquation(int k, int b, int x, int y) {
        int a = k*x+b;
        if (a == y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
