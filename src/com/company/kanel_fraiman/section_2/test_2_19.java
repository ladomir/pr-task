package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class test_2_19 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число
    и выводит на экран следующие три значения
    (все - в одной строке, разделенные пробелом):
    число, меньше введенного с клавиатуры на 1,
    число, введенное с клавиатуры,
    и число, больше введенного с клавиатуры на 1.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a - 1;
        int c = a + 1;
            System.out.println(b + " " + a + " " + c);
            System.out.printf("%d %d %d\n", b, a, c);
    }
}
