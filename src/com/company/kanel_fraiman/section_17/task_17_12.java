package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_12 {
    /*
    Напишите метод, который принимает в качестве параметра целое число и возвращает самую большую цифру в этом числе.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        maxNumber(a);
    }
    static void maxNumber(int a) {
        int max = a%10;
            while (a > 0) {
                a /= 10;
                if (a%10>max) {
                    max = a % 10;
                }
            }
        System.out.printf("\nМаксимальная цифра числа - %d", max);
    }
}
