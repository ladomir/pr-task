package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_24 {
    /*
    Напишите класс, который принимает с клавиатуры целое трехзначное
    положительное число и изменяет его следующим образом:
    • для чисел, больших 500, - переставляет местами числа единиц и
    сотен (вместо 672 - 276);
    • в остальных числах переставляются местами числа десятков и
    единиц (вместо 363 - 336).
    Программа должна вывести на экран новое значение переменной.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
            System.out.println("Введите трехзначное целое число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        if (a > 500) {
            a = a3 * 100 + a2 * 10 + a1;
        }
        else {
            a = a1 * 100 + a3 * 10 + a2;
        }
        System.out.println(a);
    }
}
