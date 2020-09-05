package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_2 {
    /*
    1. Заполните недостающие текстовые сообщения (в скобках) в соответствии
    со смыслом получаемых результатов.
    2. Приведите несколько примеров вводимых с клавиатуры выражений,
    для которых на экран выводятся соответствующие текстовые
    сообщения.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите число");
        a = scanner.nextInt();

        int digit1 = a / 10;
        int digit2 = a % 10;

        if (digit1 == digit2) {
            System.out.println("Значения составных цифр числа равны!");
        } else {
            System.out.println("Значения составных цифр числа не равны!");
        }
    }
}
