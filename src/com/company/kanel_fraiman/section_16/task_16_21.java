package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_21 {
    /*
    Напишите класс, который читает с клавиатуры целые положительные числа и для каждого числа выводит на экран:
    число цифр в числе, сумму цифр числа и число делителей введенного числа.
    Класс также должен подсчитать и вывести на экран общую сумму всех цифр введенных чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, countdigits, sumdigits, countmods, sumall = 0;

        a = scanner.nextInt();

        while (a > 0) {
            countmods = 0;
                for (int i = 2; i <= a/2; i++)
                if (a % i == 0)
                    countmods++;
                countdigits = 0;
                sumdigits = 0;

                while (a > 0) {
                    countdigits++;
                    sumdigits += a%10;
                    a /= 10;
                }
                System.out.println(countdigits + " " + sumdigits + " " + countmods);
                sumall += sumdigits;
                a = scanner.nextInt();
        }
        System.out.println(sumall);
    }
}
