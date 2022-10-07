package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_13a {
    /*
    Напишите метод, который принимает в качестве параметра два целых числа и возвращает значение true,
    если в числах одинаковое количество цифр; в ином случае метод возвращает значение false.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        amountA(a);
        amountB(b);
        compare(a, b);
    }
    public static void amountA(int a) {
        int countA = 0;
        while (a>0) {
            countA++;
            a /= 10;
        }
        System.out.print("Количество цифр числа A - " + countA);
    }

    public static void amountB(int b) {
        int countB = 0;
        while (b>0) {
            countB++;
            b /= 10;
        }
        System.out.print(", числа B - " + countB);
    }

    public static void compare (int a, int b) {
        if (a == b) {
            System.out.print(" ----> " + true);
        } else {
            System.out.print(" ----> " + false);
        }
    }
}
