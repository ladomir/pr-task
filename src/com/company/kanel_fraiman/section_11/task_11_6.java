package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_6 {
    /*
    Напишите вариант предыдущей задачи, исходя из того, что неизвестно,
    какое из вводимых с клавиатуры значений больше, а какое - меньше.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, i, c;

        System.out.println("Введите первое число a:");
            a = scanner.nextInt();
        System.out.println("Введите второе число b");
            b = scanner.nextInt();

        System.out.printf("Первое введённое число - %d, второе - %d\n", a, b);

        if (a>b) {
            for (i = 1; i <= 20; i++) {
                c = (int) (Math.random() * (a - b + 1) + b);
                System.out.print(c + "\t");
            }
        }
        if (b>a) {
            for (i = 1; i <= 20; i++) {
                c = (int) (Math.random() * (b - a + 1) + a);
                System.out.print(c + "\t");
            }
        }
        if (a==b) {
            c = a;
            System.out.print(c + "\t");
        }
    }
}
