package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_29 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число,
    представляющее собой промежуток времени в часах,
    и выводит этот же промежуток времени, но выраженный в секундах
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.printf("промежуток времени равен %d часов;", a);
        b = 3600 * a;
            System.out.println("\nпромежуток времени равен " + b + " секунд;");
            System.out.printf("промежуток времени равен %d секунд;", b);
    }
}
