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
            c = (a + b) % 10;
                System.out.println(a + b + c);
        } else {
            b = a / 2 + 1;
            c = (a * b) % 10;
                System.out.println(c - a - b);
        }

        /*
            Ответы:
        1. a = 3000 --> b = , c = , вывод на экран - ;
        2. a = 129 --> b = , c = , вывод на экран - ;
        3. a = 7 --> b = , c = , вывод на экран - ;
        4. a = 45 --> b = , c = , вывод на экран - ;
        5. a = 10 --> b = , c = , вывод на экран - ;
        6. b = 9 --> a = , c = , вывод на экран - ;
        7. b = 8 --> a = , c = , вывод на экран - ;
        8. c = 1 --> a = , b = , вывод на экран - ;
        9. c = 0 --> a = , b = , вывод на экран - ;
     */
    }
}
