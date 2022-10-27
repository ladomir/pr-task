package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_18_2 {
    /*
    Назовем «большим обменом» операцию, при которой два числа «обмениваются » своими левыми цифрами.
    1. Напишите класс, который принимает с клавиатуры два трехзначных положительных числа и совершает над ними операцию «обмена».
    2. Напишите класс, который принимает с клавиатуры два целых положительных числа и совершает над ними операцию «обмена».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

            System.out.println("Введите целое положительное число A");
        a = scanner.nextInt();
            System.out.println("Введите целое положительное число B");
        b = scanner.nextInt();

        exchangeDigitLeft(a, b);
    }

    static void exchangeDigitLeft (int a, int b) {
        int x, y, countA = 0, countB = 0;

        for (int i = a; i != 0; i /= 10) {
            countA++;
        }
        x = (int)Math.pow(10, countA-1);
        int leftA = a / x;
        int ridhtA = a % x;


        for (int i = b; i != 0; i /= 10) {
            countB++;
        }
        y = (int)Math.pow(10, countB-1);
        int leftB = b / y;
        int ridhtB = b % y;

        System.out.printf("Числа %d и %d после операции обмена - %d%d и %d%d", a, b, leftA, ridhtB, leftB, ridhtA);
    }
}
