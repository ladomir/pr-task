package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_7 {
    /*
    Назовем «дважды четным» целое положительное число, если и оно само, и сумма его делителей - четные числа.
    Напишите класс, который принимает с клавиатуры целое положительное число и проверяет, является ли оно «дважды четным».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, sum = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();

        System.out.print("Делители: ");
        for (int i = 1; i < x; i++) {
            if (x%i==0) {
                sum += i;
                System.out.print(i + "\t");
            }
        }
        if (x%2==0 && sum%2==0) {
            System.out.println("\nВведённое целое положжительное число является \"дважды чётным\"!");
        } else {
            System.out.println("\nВведённое целое положжительное число НЕ является \"дважды чётным\"!");
        }
    }
}
