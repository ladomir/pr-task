package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_23_a {
    /*
        Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
    в первой строке - все четные (по значению) цифры этого числа, через пробел;
    во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
        Например, для числа 765873 в первой строке будет выведена серия 6 8, а во второй строке - 7 5 7 3.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b = 1, c, d = 1, e, f = 1, even, odd;

        System.out.println("Введите целое пожительное число: ");

        a = c = e = scanner.nextInt();

        while (b <= a) {
            b *= 10;
        }

        b /= 10;

        while (b > 0) {
            System.out.print(a/b + " ");
            a %= b;
            b /= 10;
        }

        System.out.println();

        while (d <= c) {
            d *= 10;
        }

        d /= 10;

        while (d > 0) {
            even = c / d;
            if (even%2==0) {
                System.out.print(even + " ");
            }
            c %= d;
            d /= 10;
        }

        System.out.println();

        while (f <= e) {
            f *= 10;
        }

        f /= 10;

        while (f > 0) {
            odd = e / f;
            if (odd%2!=0) {
                System.out.print(odd + " ");
            }
            e %= f;
            f /= 10;
        }
    }
}
