package com.company.Tasks_Template.ColichestvoCifr;

import java.util.Scanner;

public class ColichestvoCifrFor {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, count = 0, sum = 0;

        System.out.println("Введите целое пожительное число: ");
        a = scanner.nextInt();

        for (int i = a; i != 0; i /= 10) {
            count++;
            sum += (i % 10);
        }

        System.out.println("Количество цифр числа - " + count + "; " + "сумма цифр числа  - " + sum);

        b = a % 9;
        if (b == 0) {
            b = 9;
        }

        System.out.println("Сумма цифр числа равна цифре - " + b);
    }
}
