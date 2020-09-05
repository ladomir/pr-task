package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_25 {
    /*
    Назовем «обменом» операцию, при которой два числа «обмениваются» своими правыми цифрами.
    Напишите класс, который принимает с клавиатуры два положительных числа и
    совершает  над ними операцию «обмена». Числа могут быть разной длины.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, b, b1;
            System.out.println("Введите первое двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введите второе двухзначное число:");
        b = scanner.nextInt();
            System.out.println("Первое введённое двухзначное число - " + a);
            System.out.println("Второе введённое двухзначное число - " + b);

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
