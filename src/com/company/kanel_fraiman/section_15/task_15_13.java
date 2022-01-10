package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_13 {
    /*
    Напишите класс, который должен принимать с клавиатуры серию возрастающих по значению целых чисел.
    Класс должен выводить на экран количество значений в серии -
    за исключением последнего введенного с клавиатуры значения.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, count = 1;

        b = scanner.nextInt();
        a = scanner.nextInt();

        while (a > b) {
            count++;
            b = a;
            a = scanner.nextInt();

        }
        System.out.printf("\nКоличество значений серии - %d", count);
    }
}
