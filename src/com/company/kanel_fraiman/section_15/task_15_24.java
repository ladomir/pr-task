package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_24 {
    /*
        Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
    • в первой строке - все четные (по месту) цифры этого числа, через пробел;
    • во второй строке - все нечетные (по месту) цифры этого числа, через пробел.
    Например, для числа 765873 в первой строке будет выведена серия 6 8 3,
    а во второй строке - 7 5 7.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b = 1, c, d = 1, e, f = 1, count = 0;

        System.out.println("Введите целое пожительное число: ");

        a = c = e = scanner.nextInt();

        while (b <= a) { // вывод введённого числа
            b *= 10;
        }

        b /= 10;

        while (b > 0) {
            System.out.print(a/b + " ");
            count++; // количество цифр введённого числа
            a %= b;
            b /= 10;
        }

        System.out.printf("\nКоличество цифр числа - %d\n", count);

        if (count%2==1) { // если количество цифр введённого числа нечётное ...

            while (d <= c) { // вывод в строку цифр на чётных позициях
                d *= 10;
            }

            d /= 10;

            while (d > 0) {
                for (int i = 1; i <= d; i++) {
                    if (i % 2 == 0) {
                        System.out.print((c / d) + " ");
                    }
                    c %= d;
                    d /= 10;
                }
            }

            System.out.println();

            while (f <= e) { // вывод в строку цифр на нечётных позициях
                f *= 10;
            }

            f /= 10;

            while (f > 0) {
                for (int i = 1; i <= f; i++) {
                    if (i % 2 != 0) {
                        System.out.print(e / f + " ");
                    }
                    e %= f;
                    f /= 10;
                }
            }
        } else { // иначе ... количество цифр введённого числа чётное ...
            while (d <= c) { // вывод в строку цифр на чётных позициях
                d *= 10;
            }

            d /= 10;

            while (d > 0) {
                for (int i = 1; i <= d; i++) {
                    if (i % 2 == 0) {
                        System.out.print((c / d) + " ");
                    }
                    if (i == d) {
                        System.out.print((c / d) + " ");
                    }
                    c %= d;
                    d /= 10;
                }
            }

            System.out.println();

            while (f <= e) { // вывод в строку цифр на нечётных позициях
                f *= 10;
            }

            f /= 10;

            while (f > 0) {
                for (int i = 1; i <= f; i++) {
                    if (i % 2 != 0) {
                        System.out.print(e / f + " ");
                    }
                    if (i == f) {
                       continue;
                    }
                    e %= f;
                    f /= 10;
                }
                break;
            }
        }
    }
}