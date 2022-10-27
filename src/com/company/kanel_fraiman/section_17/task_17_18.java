package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_18 {
    /*
    Назовем «большим обменом» операцию, при которой два числа «обмениваются » своими левыми цифрами.
    1. Напишите класс, который принимает с клавиатуры два трехзначных положительных числа и совершает над ними операцию «обмена».
    2. Напишите класс, который принимает с клавиатуры два целых положительных числа и совершает над ними операцию «обмена».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

            System.out.println("Введите трёхзначное число A");
        a = scanner.nextInt();
            System.out.println("Введите трёхзначное число B");
        b = scanner.nextInt();

        exchangeDigitLeft(a, b);
    }

    static void exchangeDigitLeft (int a, int b) {

            int leftA = a / 100;
            int ridhtA = a % 100;

            int leftB = b / 100;
            int ridhtB = b % 100;

        System.out.printf("Числа %d и %d после операции обмена - %d%d и %d%d", a, b, leftA, ridhtB, leftB, ridhtA);
    }
}
