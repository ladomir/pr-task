package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_29 {
    /*
    Напишите класс, который принимает с клавиатуры две пары целых
    ненулевых чисел: первая пара является числителем и знаменателем одной
    дроби, вторая пара - числителем и знаменателем другой дроби.
    Класс должен проверить, равны ли эти дроби друг другу, и вывести на
    экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b:");
        b = scanner.nextInt();
            System.out.println("Введите число c:");
        c = scanner.nextInt();
            System.out.println("Введите число d:");
        d = scanner.nextInt();

        if (a / b == c / d) {
            System.out.println("Дроби равны");
        } else {
            System.out.println("Дроби не равны");
        }
    }
}
