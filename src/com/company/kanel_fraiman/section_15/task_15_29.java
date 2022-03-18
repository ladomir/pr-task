package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_29 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и подсчитывает сумму его цифр.
    Результат подсчета должен быть выведен на экран. Например, для числа 534 на экран будет выведено 12.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, sum = 0;

        a = scanner.nextInt();

        while (a > 0) {
                sum += a % 10;
                a /= 10;
        }
        System.out.printf("\nСумма цифр - %d", sum);
    }
}
