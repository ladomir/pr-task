package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_22 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых числа и выводит на экран следующие значения (каждое в отдельной строке):
    сумму введенных чисел, их произведение, разницу между первым и вторым, разницу между вторым и первым.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, f;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b:");
        b = scanner.nextInt();
            System.out.printf("Введённые числа:\na = %d;\nb= %d", a, b);
        c = a + b;
        d = a * b;
        e = a - b;
        f = b - a;
        System.out.println("\nСумма введёных чисел a и b равна " + c);
        System.out.println("Произведение введёных чисел a и b равна " + d);
        System.out.println("Разница между введёнными числами a и b равна " + e);
        System.out.println("Разница между введёнными числами b и a равна " + f);
        System.out.printf("%d\n%d\nd\n%d", c, d, e, f);
    }
}
