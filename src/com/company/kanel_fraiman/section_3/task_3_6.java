package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_6 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число и выводит на экран
    (в одной строке) три следующих за ним целых числа так,
    чтобы разница между каждым числом и следующим за ним составляла 2.
    Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 8, 10, 12.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите значение числа a:");
        a = scanner.nextInt();
            System.out.println("значение числа a равно " + a);
        b = a + 2;
        c = b + 2;
        d = c + 2;
        System.out.println(b + ", " + c  + ", " + d);
        System.out.printf("%d, %d, %d", b, c, d);
    }
}
