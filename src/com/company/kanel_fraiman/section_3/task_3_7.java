package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_7 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число и
    выводит на экран три предыдущих ему целых числа,
    причем каждое - в отдельной строке.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите значение числа a:");
        a = scanner.nextInt();
            System.out.println("значение числа a равно " + a);
        b = a - 1;
        c = b - 1;
        d = c - 1;
        System.out.println(b + ", " + c  + ", " + d);
        System.out.printf("%d, %d, %d", b, c, d);
    }
}
