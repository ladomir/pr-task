package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_15 {
    /*
        Напишите класс, который принимает с клавиатуры двузначное положительное целое число Х,
     составленное из разных цифр, и возвращает сумму однозначных чисел, заключенных между цифрами этого числа Х
    (включая сами цифры, из которых составлено число Х).
        Например, и для числа 52, и для числа 25 будет возвращено значение 14 (2 + 3 + 4 + 5 = 14).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, x1, x2, sum = 0;

            System.out.println("Введите двухзначное число, составленное из разных цифр: ");
        x = scanner.nextInt();

        x1 = x / 10;
        x2 = x%10;

        if (x1<x2) {
            if (x1 != x2) {
                for (int i = x1; i <= x2; i++) {
                    sum += i;
                }

                System.out.printf("Сумма однозначных цифр, заключённых между цифрами числа равна %d", sum);

            } else {
                    System.out.println("Введите двухзначное число, составленное из РАЗНЫХ цифр: ");
                sum = x1 + x2;
                    System.out.printf("Сумма цифр числа равна %d", sum);
            }
        } else {
            if (x2 != x1) {
                for (int i = x2; i <= x1; i++) {
                    sum += i;
                }

                System.out.printf("Сумма однозначных цифр, заключённых между цифрами числа равна %d", sum);

            } else {
                    System.out.println("Введите двухзначное число, составленное из РАЗНЫХ цифр: ");
                sum = x1 + x2;
                    System.out.printf("Сумма цифр числа равна %d", sum);
            }
        }

        //System.out.printf("Сумма однозначных цифр, заключённых между цифрами числа равна %d", sum);
    }
}
