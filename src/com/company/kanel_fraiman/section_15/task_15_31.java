package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_31 {
    /*
        Напишите класс, который принимает с клавиатуры серию целых чисел до тех пор,
    пока количество четных чисел в серии остается меньше 5.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count = 0;

        while (count < 5) {
            count = 0;
            a = scanner.nextInt();
            while (a > 0) {
                if (a % 2 != 1) {
                    count++;
                }
                a /= 10;
            }
            System.out.printf("\nКоличество чётных цифр - %d\n", count);
        }
    }
}
