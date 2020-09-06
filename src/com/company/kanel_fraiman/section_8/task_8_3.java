package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите целое двухзначное число a:");
        a = scanner.nextInt();

        b = a / 10;
        c = a % 10;

        System.out.println(b + " --> " + c);

        if (b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (b > c) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        /*

        1. a = 21 --> No Good;
        2. a = 21, b = 3 --> No Bad;
        3. a = 13, b = 13 --> Yes Bad;
        4.  if (b == c) --> "Количество десятков равно количеству едениц"
                else --> "Количество десятков НЕ равно количеству едениц"
            if (b > c) --> "Количество десятков больше количества едениц"
                else --> "Количество десятков меньще или равно количеству едениц";
        5. a = 367 --> будет, просто значение количества десятков будет двухзначным;
        6. a = 8 --> будет, просто значение количества десятков будет нулевым;
         */

    }
}
