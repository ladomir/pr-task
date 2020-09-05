package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b");
        b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (b % a == 0) {
            a += 2;
            System.out.println("Good");
        } else {
            a = 2;
            System.out.println("Bad");
        }
        System.out.println(a);

        /*

        1. a = 3, b = 21 --> No Good 5;
        2. a = 21, b = 3 --> Yes Bad 2;
        3. a = 13, b = 13 --> Yes Good 15;
        4. a = 5, b = 12 --> No Bad 2;

         */

    }
}
