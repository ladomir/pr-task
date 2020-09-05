package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_24 {
    /*
    Назовем «обменом» операцию, при которой два числа «обмениваются» своими правыми цифрами.
    Напишите класс, который принимает с клавиатуры два трехзначных положительных числа и
    совершает над ними операцию «обмена».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, b, b1;
            System.out.println("Введите первое трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введите второе трёхзначное число:");
        b = scanner.nextInt();
            System.out.println("Первое введённое трёхзначное число - " + a);
            System.out.println("Второе введённое трёхзначное число - " + b);

        a1 = a % 10;
        a = a / 10;
        b1 = b % 10;
        b = b / 10;
        a = a * 10 + b1;
        b = b * 10 + a1;

        System.out.println("Число a после операции \"обмена\" равно " + a + ", число b - " + b);
        System.out.printf("Число a после операции \"обмена\" равно %d, число b - %d", a, b);
    }
}
