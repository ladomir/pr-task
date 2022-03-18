package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_30 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и подсчитывает количество нулей в этом числе.
    Результат подсчета надо вывести на экран.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count = 0;

        a = scanner.nextInt();

        while (a > 0) {
            if (a%10==0) {
                count++;
            }
            a /= 10;
        }
        System.out.printf("\nКоличество нулей - %d", count);
    }
}
