package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_14 {
    /*
    Напишите класс,
    который принимает с клавиатуры положительное трехзначное число,
    а затем вычисляет и выводит на экран его «степень четности».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e = 0;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;

        if (b%2==0) {
            e++;
        }
        if (c%2==0) {
            e++;
        }
        if (d%2==0) {
            e++;
        }

        System.out.println("Степень чётности числа равна " + e);
        System.out.printf("Степень чётности числа равна %d", e);
    }
}
