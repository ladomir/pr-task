package com.company.Tasks_Template.CifryChisla;

import java.util.Scanner;

public class task_3 {
    /*
    Определение количества цифр, первой цифры, суммы цифр и зеркального отображения цифр введённого числа
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        countDigits(a); // количесвто цифр числа
        sumDigits (a); // сумма цифр числа
        countSumDigits(a); // количесвто и сумма цифр числа
        digitLeft(a); // первая цифра числа
        mirrorNumber(a); // обратный порядок цифр числа
    }

    static void countDigits (int a) { // количесвто и сумма цифр числа
        int count = 0;
        while (a>0) {
            count++;
            a /= 10;
        }
        System.out.println("Количество цифр числа - " + count + "; ");
    }

    static void sumDigits (int a) { // количесвто и сумма цифр числа
        int sum = 0;
        while (a>0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("Сумма цифр числа  - " + sum);
    }

    static void countSumDigits (int a) { // количесвто и сумма цифр числа
        int sum = 0, count = 0;
        while (a>0) {
            sum += a % 10;
            count++;
            a /= 10;
        }
        System.out.println("Количество цифр числа - " + count + "; " + "сумма цифр числа  - " + sum);
    }


    static void digitLeft (int a) { // первая цифра числа
        do {
            a /= 10;
        }
        while (a/10 !=0);
        System.out.println("Первая цифра числа - " + a);
    }

    static void mirrorNumber (int a) { // обратный порядок цифр числа
        int mirror = 0;
        while (a != 0) {
            mirror = mirror * 10 + (a%10);
            a = a / 10;
        }
        System.out.println("Обратный порядок цифр числа - " + mirror);
    }
}
