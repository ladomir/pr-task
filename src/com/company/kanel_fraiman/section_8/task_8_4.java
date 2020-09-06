package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, t;
            System.out.println("Введите значение x:");
        x = scanner.nextInt();

        if (x / 10 >= 5) {
            t = 20;
                System.out.println(t);
        } else {
            t= 0;
                System.out.println(t);
        }

        /*

        1. x = 59 --> 20;
        2. x = 8 --> 0;
        3. x = 21 --> 0;
        4. x = 20 --> 0;
        5. x = 0 --> 0;
        6. Словесное описание оператора --> "Если значение x, разделённое на 10, больше или равно 5,
                                            переменной t присваивается значение 20, иначе - 0.";

        */

    }
}
