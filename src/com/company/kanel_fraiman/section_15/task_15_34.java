package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_34 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число х.
    Класс должен определить наибольшее значение в серии 12+22+32+ .. " сумма которой не превышаетх.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, x, sum = 0;

        x = scanner.nextInt();

        a = 1;

        while (sum <= x) {
            a++;
            sum += a * a;
            System.out.print(a + "("+ sum +") ");
        }
        System.out.println();
        System.out.println(a - 1);
    }
}
