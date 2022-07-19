package com.company.kanel_fraiman.section_16;

public class task_16_8 {
    /*
    Напишите класс, который будет выводить на экран суммы делителей каждого числа от 1 до 75.
     */
    public static void main(String[] args) {
        int a = 75;
        for (int i = 1; i <= a; i++) {
            int sum = 0;
            System.out.print("\nДелители числа " + i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    System.out.print(" " + j);
                    sum += j;
                }
            }
            System.out.print("; сумма делителей числа " + i + " равна - " + sum);
        }
    }
}
