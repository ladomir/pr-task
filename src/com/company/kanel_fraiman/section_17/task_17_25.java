package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_25 {
    /*
    Напишите метод, который принимает в качестве параметра целое положительное число N.
    Метод возвращает количество простых чисел, находящихся в диапазоне 1 ... N.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        System.out.println("Введите целое положительное число N");
        a = scanner.nextInt();

        numberOfPrimes(a);
    }

    public static void numberOfPrimes(int a) {
        int b, n = 0, sumI = 0;
        System.out.print("Простые двухзначные числа: ");
        for (int i = 1; i <= a; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum == 1) {
                n++;
                sumI += i;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\nКоличество простых чисел, находящихся в диапазоне 1 ... N - %d, их сумма - %d", n, sumI);
    }
}
