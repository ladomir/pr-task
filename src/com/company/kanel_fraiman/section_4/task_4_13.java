package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_13 {
    /*
    Назовем «степенью четности» числа количество четных цифр в нем.
    Например, для числа 4612 степень четности равна 3
    (в его составе три четных цифры - 4, 6 и 2).
    Напишите класс,
    который принимает с клавиатуры положительное двузначное число,
    а затем вычисляет и выводит на экран его «степень четности».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d = 0;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

        b = a / 10;
        c = a % 10;
        if (b%2==0) d++;
        if (c%2==0) d++;

        System.out.println("Степень чётности числа равна " + d);
        System.out.printf("Степень чётности числа равна %d", d);
    }
}
