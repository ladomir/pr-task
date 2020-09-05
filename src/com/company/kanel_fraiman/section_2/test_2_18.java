package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class test_2_18 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число
    и затем выводит на экран его квадрат и его же куб, а между ними знак &.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a * a;
        int c = b * a;
            System.out.println(b + " & " + c);
        int d = (int)Math.pow(a, 2);
        int e = (int)Math.pow(a, 3);
            System.out.printf("%d & %d\n", d, e);
    }
}
