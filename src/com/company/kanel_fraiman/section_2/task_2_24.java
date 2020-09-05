package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_24 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа,
    каждое из которых представляет собой размер одной из сторон прямоугольника
    и выводит на экран следующие значения (каждое в отдельной строке):
    площадь прямоугольника и его периметр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, s, p;
        System.out.println("Введите число a:");
        a = scanner.nextInt();
        System.out.println("Введите число b:");
        b = scanner.nextInt();
        System.out.printf("\nширина прямоугольника - %d;\nдлина прямоугольника - %d;", a, b);
        s = a * b;
        p = 2 * a + 2 * b;
        System.out.println("\nплощадь прямоугольника равна " + s + ";");
        System.out.println("периметр прямоугольника равен " + p + ";");
        System.out.printf("площадь прямоугольника равна %d;\nпериметр прямоугольника равен %d", s, p);
    }
}
