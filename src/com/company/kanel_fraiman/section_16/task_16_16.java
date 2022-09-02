package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_16 {
    /*
    Напишите класс, который выводит на экран все положительные четные двузначные числа,
    сумма делителей которых тоже является четным числом.
     */

    public static void main(String[] args) {

        System.out.print("\nВсе чётные двухзначные числа, сумма, которых является четным числом: \n");

        for (int i = 10; i < 100; i+=2) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum%2==0) {
//                System.out.println(i + ": - сумма делителей равна - " + sum + "; ");
                System.out.print(i + " ");
            }
        }
    }
}
