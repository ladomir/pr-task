package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_19 {
    /*
    Напишите класс, который вводит с клавиатуры 15 целых положительныхчисел,
    для каждого введенного числа класс напечатает сумму его цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, n = 15, sum = 0;

        for (int i = 0; i < n; i++){
            a = scanner.nextInt();

            b = a;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            System.out.printf("\nСумма цифр числа %d равна - %d", b, sum);
        }
    }
}
