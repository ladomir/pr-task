package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_9 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();

        if (a % 2 != 1) {
            b = a / 2;
                System.out.println("b = " + b);
            c = (a + b) % 10;
                System.out.println("c = " + c);

                System.out.println(a + b + c);
        } else {
            b = a / 2 + 1;
                System.out.println("b = " + b);
            c = (a * b) % 10;
                System.out.println("c = " + c);

                System.out.println(c - a - b);
        }

        /*
            Ответы:
        1. a = 3000 --> b = 1500, c = 0, вывод на экран - 4500;
        2. a = 129 --> b = 65, c = 5, вывод на экран - -89;
        3. a = 7 --> b = 4, c = 8, вывод на экран - -3;
        4. a = 45 --> b = 23, c = 5, вывод на экран - -63;
        5. a = 10 --> b = 5, c = 5, вывод на экран - 20;
        6. b = 9 --> a = 18, c = 7, вывод на экран - 34; // методом подбора
        7. b = 8 --> a = 16, c = 4, вывод на экран - 28; // методом подбора
        8. c = 1 --> a = 13, b = 7, вывод на экран - -19; // методом подбора
        9. c = 0 --> a = 0, b = 0, вывод на экран - 0; // методом подбора
     */
    }
}
