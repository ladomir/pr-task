package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_27 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число,
    представляющее собой массу тела в граммах,
    и выводящую на экран массу этого тела в килограммах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        double b;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.printf("масса в граммах равна %d", a);
        b = (double) a / 1000;
            System.out.println("\nмасса равна " + b + " кг;");
            System.out.printf("масса равна %.3f кг", b);
    }
}
