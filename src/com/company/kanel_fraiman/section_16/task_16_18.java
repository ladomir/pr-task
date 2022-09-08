package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_18 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число
    и выводит на экран все его делители, которые являются простыми числами.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, s = scanner.nextInt();
            System.out.print("\nДелители числа " + s + ", которые являются простыми числами: ");
        for (int i = 1; i <= s; i++) {
            if (s%i==0) {
                int sum = 0;
                a = i;
                for (int j = 1; j < a; j++) {
                    if (a % j == 0) {
                        sum += j;
                    }
                }
                if (sum == 1) {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
