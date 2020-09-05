package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_26 {
    /*
    Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
    1. Напишите класс, который принимает с клавиатуры два трехзначных положительных числа и
    совершает над ними операцию «обмена».
    2. Возможно ли совершить операцию «большого обмена»,
    если два числа имеют разное количество цифр? Обоснуйте свой ответ.
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

        a1 = a / 100;
            System.out.println(a1);
        a = a % 100;
            System.out.println(a);
        b1 = b / 100;
            System.out.println(b1);
        b = b % 100;
            System.out.println(b);
        a = b1 * 100 + a;
            System.out.println(a);
        b = a1 * 100 + b;
            System.out.println(b);

        System.out.println("Число a после операции \"обмена\" равно " + a + ", число b - " + b);
        System.out.printf("Число a после операции \"обмена\" равно %d, число b - %d", a, b);
    }
}
