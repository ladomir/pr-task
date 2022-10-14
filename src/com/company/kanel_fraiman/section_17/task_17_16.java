package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_16 {
    /*
    Напишите метод, который получает в качестве параметра целое положительное число.
    Метод возвращает крайнюю левую цифру числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        digitLeft(a);
    }

    static void digitLeft (int a) {
        do {
            a /= 10;
        }
            while (a/10 !=0);
        System.out.println("Первая цифра числа - " + a);
    }
}
