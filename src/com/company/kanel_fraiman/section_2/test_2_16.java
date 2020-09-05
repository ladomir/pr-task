package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class test_2_16 {
    /*
    Напишите класс, который принимает с клавиатуры целое число
    и выводит на экран два новых числа (каждое в отдельное строке):
    число, больше введенного с клавиатуры на 6,
    и число, меньше введенного с клавиатуры на 12.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a + 6;
            System.out.printf("Число, больше введенного с клавиатуры на 6, - %d.\n", b);
        int c = a - 12;
            System.out.printf("Число, меньше введенного с клавиатуры на 12, - %d.", c);
    }
}
