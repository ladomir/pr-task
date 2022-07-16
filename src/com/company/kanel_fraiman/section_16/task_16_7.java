package com.company.kanel_fraiman.section_16;

public class task_16_7 {
    /*
    Напишите класс, который будет выводить на экран делители каждого числа от 1до75.
     */
    public static void main(String[] args) {
        int a = 55;
        for (int i = 1; i <= a; i++) {
            System.out.print("\nДелители числа " + i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    System.out.print(" " + j);
                }
            }
        }
    }
}
