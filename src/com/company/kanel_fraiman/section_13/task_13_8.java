package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_8 {
    /*
    Назовем «дважды делимым» целое положительное число, если и оно само,
    и сумма его делителей - делятся (без остатка, разумеется) на количество делителей числа.
    Напишите класс, который принимает с клавиатуры целое положительное число и проверяет, является ли оно· «дважды делимым».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, count = 0, sum = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();

        System.out.print("Делители: ");
        for (int i = 1; i <= x; i++) {
            if (x%i==0) {
                count++;
                sum += i;
                System.out.print(i + "\t");
            }
        }

        System.out.println("\nКоличество делителей - " + count + "\nСумма делителей - " + sum);

        if (x/count==0 && sum/count==0) {
            System.out.println("\nВведённое целое положительное число является \"дважды делимым\"!");
        } else {
            System.out.println("\nВведённое целое положительное число НЕ является \"дважды делимым\"!");
        }
    }
}
