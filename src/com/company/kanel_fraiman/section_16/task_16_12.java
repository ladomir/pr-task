package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_12 {
    /*
        Напишите класс, который находит натуральное число от 1 до 10000 с максимальной суммой делителей.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, max = 0;

        int s = scanner.nextInt();;

        for (int i = 1; i <= s; i++) {
            int n = 0;
            System.out.print("\n" + i);
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    n++;
                    System.out.print("+");
                }
                if (n > max) {
                    max = n;
                    a = i;
                }
            }
            System.out.print(" - количество делителей - " + n);
        }
        System.out.println("\nМаксимальное количество делителей - " + max + " (число - " + a + ")");
    }
}
