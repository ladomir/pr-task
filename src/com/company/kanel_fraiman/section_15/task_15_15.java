package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_15 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит на экран количество четных цифр в нем и их сумму.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n = 0, count = 0, sum = 0;

        a = scanner.nextInt();

        while (a>0) {
            sum += a % 10;
            if (a%2==0) {
                count++;
            }
            a /= 10;
        }
        System.out.printf("Количество чётных цифр числа - %d, их сумма - %d", count, sum);
    }
}
