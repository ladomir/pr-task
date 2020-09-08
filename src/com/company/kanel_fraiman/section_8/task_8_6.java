package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_6 {
    /*
    Заполнить таблицу, исходя из данных условия задачи
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, x;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();
            System.out.println("Введите целое число:");
        b = scanner.nextInt();

        if (a * 2 != b) {
            x = a / 2 + b;
        } else {
            x = b / 2 + a;
        }
        if (x < 15) {
            System.out.println("X=" + x);
        } else {
            System.out.println(x);
        }

        /*
                Ответы:
            Таблица 1
        1. a = 10, b = 11 --> x = 16; на экране 16;
        2. a = -5, b = 10 --> x = 8; на экране X=8;
        3. a = 12, b = 6 --> x = 12; на экране X=12;
        4. a = 6, b = 12 --> x = 12; на экране X=12;
        5. a = 7, b = 7 --> x = 10; на экране X=10;
        6. a = 14, b = 14 --> x = 21; на экране 21;
        7. a = 9, b = 18 --> x = 18; на экране 18;

            Таблица 2
        1. a = 10, X = 26 --> b = 21; на экране 26;
        2. b = 10, X = -10 --> a = -40; на экране X=-10;
        3. на экране X=30 --> a = ?; b = ?; x = ?;
        4. a = 6, X = 0 --> b = -3; на экране 0;
        5. a = 7, на экране 10 --> b = 6; X = 10;
        6. b = 14, X = 14 --> a = 7; на экране X = 14;
        7. a = 9, X = 9 --> b = 0; на экране 9;

         */
    }
}
