package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_3 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное двузначное число и
    выводит на экран его цифры, разделенные знаком «пробел», но в обратном порядке.
    То есть для числа 45 будет выведено на экран 5 4.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

        b = a / 10;
        c = a % 10;

            System.out.println(c + " " + b);
            System.out.printf("%d %d", c, b);
    }
}
