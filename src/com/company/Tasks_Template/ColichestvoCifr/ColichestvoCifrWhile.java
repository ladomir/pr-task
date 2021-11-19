package com.company.Tasks_Template.ColichestvoCifr;

import java.util.Scanner;

public class ColichestvoCifrWhile {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, count = 0, sum = 0;

        a = scanner.nextInt();

        b = a % 9;
        if (b == 0) {
            b = 9;
        }

        System.out.println("Сумма цифр числа равна цифре - " + b);

        while (a>0) {
            sum += a % 10;
            count++;
            a /= 10;
        }
        System.out.println("Количество цифр числа - " + count + "; " + "сумма цифр числа  - " + sum);
    }
}
