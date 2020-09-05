package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_11 {
    /*
    Назовем «длиной двузначного числа» разницу между числом десятков (первая цифра) и
    числом единиц (вторая цифра).
    Напишите класс,
    который принимает с клавиатуры двузначное число и выводит на экран его «длину».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
        System.out.println("Введённое двухзначное число - " + a);

        b = a / 10;
        c = a % 10;
        d = b - c;

        System.out.println("Составные цифры - " + b + " и " + c + ", длина двухзначного числа - " + d);
        System.out.printf("Составные цифры - %d и %d, длина двухзначного числа - %d", b, c, d);
    }
}
