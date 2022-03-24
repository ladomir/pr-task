package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_36 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и определяет, является ли оно точным квадратом целого числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double x, a;

        x = scanner.nextInt();

        a = Math.sqrt(x);

        System.out.println(a);

        if (a * a == x) {
            System.out.print("Введённое число является точным квадратом цеого числа");
        } else {
            System.out.print("Введённое число НЕ является точным квадратом цеого числа");
        }
    }
}
