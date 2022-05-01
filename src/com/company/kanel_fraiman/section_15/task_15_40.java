package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_40 {
    /*
        Напишите класс, который принимает с клавиатуры целое положительное число и находит его наибольший делитель,
    отличный от самого числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        System.out.println("Введите число: ");
        a = b = scanner.nextInt();
        b--;

        while (b < a) {
            b--;
            if (a%b==0) {
                System.out.printf("Наибольший делитель - %d", b);
                break;
            }
        }
    }
}
