package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_16 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и
    выводит на экран количество четных цифр в нем и сумму его нечетных цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n = 0, count = 0, sumA = 0, sum = 0;

        a = scanner.nextInt();

        while (a>0) {
            sumA += a % 10;
            if (a%2==0) {
                count++;
            }
            if (a%2==1) {
                sum += a % 10;
            }
            a /= 10;
        }
        System.out.printf("Количество чётных цифр числа - %d, сумма нечётных цифр - %d", count, sum);
    }
}
