package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_11 {
    /*
    Напишите класс, который принимает с клавиатуры целое число,
    а затем проверяет, можно ли представить его в виде суммы квадратов двух целых чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = 0;

        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (i*i+j*j==a) {
                    System.out.println(i*i+"+"+j*j);
                    x = 1;
                }
            }
        }
        if (x == 1) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }
}
