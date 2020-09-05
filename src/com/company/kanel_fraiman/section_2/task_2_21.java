package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_21 {
    /*
    Напишите класс, который принимает с клавиатуры целое число
    и выводит на экран следующие значения (каждое в отдельной строке):
    три целых числа, следующих за значением, введенным с клавиатуры.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a, b, c, d;
        a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        b = a + 1;
        c = a + 2;
        System.out.println(b);
        System.out.println(c);
        System.out.printf("%d\n%d", b, c);
    }
}
