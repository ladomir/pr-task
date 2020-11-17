package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_32 {
    /*
    Напишите класс, который принимает с клавиатуры четырехзначное
    число и проверяет, означает ли оно один из високосных годов
    20 века.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите четырёхзначное число a:");
        a = scanner.nextInt();

        if (a > 1900 && a <= 2000 && a % 4 == 0) {
            System.out.println("Число означает высокосный год ХХ века");
        } else {
            System.out.println("Число НЕ означает высокосный год ХХ века");
        }
    }
}
