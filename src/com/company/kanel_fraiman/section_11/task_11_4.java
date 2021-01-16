package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_4 {
    /*
    Дан класс:
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i,x1,x2;
            System.out.println("Введите значение x1:");
        x1 = scanner.nextInt();
        for (i = 1; i < 5; i++) {
            System.out.println("Введите значение x1:");
            x2 = scanner.nextInt();
            if (x2 > x1)
                System.out.println(x2);
            x1 = x2;
        }
    }
    Постройте таблицу трассировки и укажите, что будет выведено на экран.
    Выберите значения, которые будут вводиться с клавиатуры.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i,x1,x2;
            System.out.println("Введите значение x1:");
        x1 = scanner.nextInt();
            for (i = 1; i < 5; i++) {
                    System.out.println("Введите значение x2:");
                x2 = scanner.nextInt();
                    if (x2 > x1)
                        System.out.println(x2);
                    x1 = x2;
            }
    }
}
