package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_10 {
    /*
    Целое число называется <<Полноценным»,
    если сумма делителей (включая 1, но, не включая само число) числа равна самому числу.
    Напишите класс, который выводит на экран все «полноценные» числа ОТ 1 ДО 100000.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = scanner.nextInt();;

        System.out.print("\nВсе полноценные числа (от 1 до 10000): ");

        for (int i = 1; i <= a; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum==i) {
                System.out.print(i + " ");
            }
        }
    }
}
