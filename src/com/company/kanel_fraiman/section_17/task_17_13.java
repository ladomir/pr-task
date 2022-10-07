package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_13 {
    /*
    Напишите метод, который принимает в качестве параметра два целых числа и возвращает значение true,
    если в числах одинаковое количество цифр; в ином случае метод возвращает значение false.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, d;
        boolean e;

        a = scanner.nextInt();
        b = scanner.nextInt();

        c = amountA(a);
        d = amountB(b);
        e = compare(c,d);

        System.out.printf("Количество цифр числа A - %d, числа B - %d ----> %b", c, d, e); // %b - boolean
    }
    public static int amountA(int a) {
        int countA = 0;
        while (a>0) {
            countA++;
            a /= 10;
        }
        return countA;
    }

    public static int amountB(int b) {
        int countB = 0;
        while (b>0) {
            countB++;
            b /= 10;
        }
        return countB;
    }

    public static boolean compare (int c, int d) {
        if (c == d) {
            return true;
        } else {
            return false;
        }
    }
}
