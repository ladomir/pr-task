package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_7 {
    /*
    Напишите класс, который принимает с клавиатуры два числа, которые
    должны быть значениями двух углов в треугольнике. Класс должен определять,
    о каком из следующих типов треугольников идет речь: остроугольный,
    тупоугольный, прямоугольный, равнобедренный, равносторонний
    (возможно, что треугольник относится сразу к двум типам).
    В случае если введенные с клавиатуры данные (или хотя бы одно из
    них) не могут быть углами треугольника, следует вывести на экран сообщение
    Ошибочные данные.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите значение угла a:");
        a = scanner.nextInt();
            System.out.println("Введите значение угла b:");
        b = scanner.nextInt();

        if (a + b != 90 && a + b > 90 && a < 90 && b < 90) {
            System.out.println("Треугольник остроугольный");
        }
        if (a + b < 90) {
            System.out.println("Треугольник тупоугольный");
        }
        if (a + b == 90) {
            System.out.println("Треугольник прямоугольный");
        }
        if (a + b == 120 && a == b) {
            System.out.println("Треугольник равнобедренный");
        }
        if (a == b) {
            System.out.println("Треугольник равносторонний");
        }
        if (a + b >= 180 && a >= 180 && b >= 180) {
            System.out.println("Ошибочные данные");
        }
    }
}
