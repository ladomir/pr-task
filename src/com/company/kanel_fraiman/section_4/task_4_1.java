package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_1 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное двузначное число и
    выводит на экран его цифры, разделенные знаком «пробел».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

        b = a / 10;
        c = a % 10;

        System.out.println(b + " " + c);
        System.out.printf("%d %d", b, c);
    }
}
