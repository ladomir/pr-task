package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_21 {
    /*Напишите метод, который принимает в качестве параметров координаты точки на плоскости (Х и У)
    и возвращает расстояние между этой точкой и началом координат.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double x, y;

            System.out.println("Введите значение X");
        x = scanner.nextDouble();
            System.out.println("Введите значение Y");
        y = scanner.nextDouble();

        distance(x,y);
    }

    public static void distance(double x, double y) {
        double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            System.out.println("Расстояние между точкой и началом координат составляет - " + d);
    }
}
