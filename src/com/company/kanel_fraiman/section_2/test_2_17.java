package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class test_2_17 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число
    и затем выводит на экран его квадрат.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a * a;
            System.out.printf("Квадрат введённого числа равен %d.\n", b);
        int c = (int)Math.pow(a, 2);
            System.out.printf("Квадрат введённого числа равен %d.\n", c);
    }
}
