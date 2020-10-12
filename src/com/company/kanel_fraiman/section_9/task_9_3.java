package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_3 {
    /*
    Запиши в форме, принятой в языке Java, следующие условия, выраженные
    в таблице в словесной форме.
     */

    /*
    Значение переменной - четное, но не заканчивается на О
    Значение переменной делится на 3, но не делится на4
    Значение переменной делится на 5 с остаткам 2, а на 3 делится с остатком 1
    Одна из цифр двузначного целого числа (значения переменной) равна 3
    Значение переменной представляет собой «правильную» оценку
    Ученик получил как минимум 4 и по английскому, и по математике
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, d1, d2, e;

            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b");
        b = scanner.nextInt();
            System.out.println("Введите число a:");
        c = scanner.nextInt();
            System.out.println("Введите число b");
        d = scanner.nextInt();

        // Значение переменной - четное, но не заканчивается на 0
        if (a % 2 == 0 && a != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Значение переменной делится на 3, но не делится на 4
        if (b % 3 == 0 && b % 4 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Значение переменной делится на 5 с остаткам 2, а на 3 делится с остатком 1
        if (c % 5 == 2 && c % 3 == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Одна из цифр двузначного целого числа (значения переменной) равна 3
        if (d >= 10 && d < 100) {
            d1 = d / 10;
            d2 = d % 10;
                if (d1 % 3 == 0 || d2 % 3 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
        }
        // Значение переменной представляет собой «правильную» оценку
        // Ученик получил как минимум 4 и по английскому, и по математике
    }
}
