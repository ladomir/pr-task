package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Введите целое число:");
        a = scanner.nextInt();
        System.out.println("Введите целое число:");
        b = scanner.nextInt();

        int c = a / 2 + b / 2;

        System.out.println("c начальное равно - " + c);

        if (a + b != c) {
            c = a / 2 + b / 2;
            System.out.println("C = " + c);
        } else {
            c = a % 2 + b % 2;
            System.out.println("C is " + c);
        }
    }

    /*
            Ответы:
        1. a = 5, b = 8 --> c(начальное) = 6, c(конечное) = 6, вывод на экран - C = 6;
        2. a = 4, b = 6 --> c(начальное) = 5, c(конечное) = 5, вывод на экран - C = 5;
        3. a = 3, b = 7 --> c(начальное) = 4, c(конечное) = 4, вывод на экран - C = 4;
     */
}
