package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_15 {
    /*
    Напишите класс,
    который принимает с клавиатуры положительное четырехзначное число,
    а затем вычисляет и выводит на экран его «степень четности».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, f = 0;
            System.out.println("Введите четырёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + a);

        b = a / 1000;
        c = (a % 1000) / 100;
        d = (a % 100) / 10;
        e = a % 10;

        if (b%2==0) {
            f++;
        }
        if (c%2==0) {
            f++;
        }
        if (d%2==0) {
            f++;
        }
        if (e%2==0) {
            f++;
        }

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("Степень чётности числа равна " + f);
        System.out.printf("Степень чётности числа равна %d", f);
    }
}
