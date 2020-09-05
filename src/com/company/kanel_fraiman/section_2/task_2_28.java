package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_28 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число,
    представляющее собой расстояние в единицах, принятых на флоте - в кабельтовых.
    После этого следует вывести на экран это же расстояние в метрах и километрах.
    Известно, что 1 кабельтов = 185.2 метра.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        double b, c;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.printf("растояние в кабельтовых равно %d", a);
        b = (double) a * 185.2;
            System.out.println("\nрасстояние в метрах равно " + b + ";");
        c = (double) a * 0.1852;
            System.out.println("\nрасстояние в километрах равно " + c + ";");
            System.out.printf("расстояние в метрах равно %.1f; в километрах - %.3f", b, c);
    }
}
