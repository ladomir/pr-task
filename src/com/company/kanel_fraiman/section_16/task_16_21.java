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

        int a, b, sum = 0, summA = 0;

        a = scanner.nextInt();
        b = a;

        while (a>0) {
            int count = 0;
                System.out.print("Число " + a + ": ");
            sum = 0;
            while (a > 0) {
                sum += a % 10;
                count++;
                a /= 10;
            }
                System.out.print("\n\t- количество цифр - " + count + ", их сумма - " + sum);
            summA += sum;
                System.out.print("\n\t- делители: ");

                for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
            a = scanner.nextInt();
            b = a;
        }
        System.out.println("Общая сумма всех цифр введенных чисел - " + summA);
    }
}
