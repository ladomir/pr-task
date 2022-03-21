package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_32 {
    /*
        Напишите класс, который принимает с клавиатуры серию целых чисел до тех пор,
    пока количество четных чисел на нечетных местах в серии остается меньше 5.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b = 1, e, c, f = 1, count = 0, counter = 0;

        while (counter < 3) {
            counter = 0;

            System.out.println("Введите целое пожительное число: ");

            a = e = scanner.nextInt();

            while (b <= a) { // вывод введённого числа
                b *= 10;
            }

            b /= 10;

            while (b > 0) {
                System.out.print(a / b + " ");
                count++; // количество цифр введённого числа
                a %= b;
                b /= 10;
            }

            System.out.printf("\nКоличество цифр числа - %d\n", count);

            if (count % 2 == 1) { // если количество цифр введённого числа нечётное ...

                while (f <= e) { // вывод в строку цифр на нечётных позициях
                    f *= 10;
                }

                f /= 10;

                while (f > 0) {
                    for (int i = 1; i <= f; i++) {
                        if (i % 2 != 0) {
                            System.out.print(e / f + " ");
                            if ((e / f) % 2 == 0) {
                                counter++;
                            }
                        }
                        e %= f;
                        f /= 10;
                    }
                }
                System.out.printf("\nКоличество чётных цифр на нечётных местах - %d\n", counter);

            } else { // иначе ... количество цифр введённого числа чётное ...

                while (f <= e) { // вывод в строку цифр на нечётных позициях
                    f *= 10;
                }

                f /= 10;

                while (f > 0) {
                    for (int i = 1; i <= f; i++) {
                        if (i % 2 != 0) {
                            System.out.print(e / f + " ");
                            if ((e / f) % 2 == 0) {
                                counter++;
                            }
                        }
                        if (i == f) {
                            continue;
                        }
                        e %= f;
                        f /= 10;
                    }
                    break;
                }
                System.out.printf("\nКоличество чётных цифр на нечётных местах - %d\n", counter);
            }
        }
    }
}
