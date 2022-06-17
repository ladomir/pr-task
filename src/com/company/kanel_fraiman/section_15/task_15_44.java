package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_44 {
    /*
        Наибольший общий делитель (НОД) двух целых положительных чисел можно определить по алгоритму Евклида:
    НОД чисел а, Ь равен НОД меньшего из чисел и остатка от деления большего числа на меньшее.
        Напишите класс, который принимает с клавиатуры два целых положительных числа и определяет их НОД описанным методом.

        По методу Евклида: НОД (a, b) = НОД (b, c), c = a % b.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

            System.out.println("Введите число a: ");
        a = scanner.nextInt();
            System.out.println("Введите число b: ");
        b = scanner.nextInt();

        if (b != 0) {

            c = a % b;

            System.out.println(c);

            while (b != 0 && c != 0) {
                if (b >= c) {
                    b = b % c;
                } else {
                    c = c % b;
                }
            }

            if (a == 0) {
                System.out.println("Наибольший общий делитель - " + b);
            } else {
                System.out.println("Наибольший общий делитель - " + a);
            }
        } else {
            System.out.println("Наибольший общий делитель - " + a);
        }
    }
}
