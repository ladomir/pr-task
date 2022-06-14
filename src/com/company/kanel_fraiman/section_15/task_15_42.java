package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_42 {
    /*
        Последовательность Фибоначчи определяется как серия чисел, в которой первый и второй члены равны 1,
    а любой член, начиная с третьего, равен сумме двух предыдущих членов.
        Напишите класс, который принимает с клавиатуры целое положительное число и проверяет,
    является ли оно членом последовательности Фибоначчи.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a1 = 1, a2 = 1, a3, x;

        System.out.println("Введите число: ");
        x = scanner.nextInt();
        if (x == 1) {
            System.out.println("Введённое число является числом Фибоначчи");
            return;
        }
        a3 = a1 + a2;
        while (x > a3) {
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
            System.out.println(a3 + " ");
        }
        if (x == a3) {
            System.out.println("Введённое число является числом Фибоначчи");
        } else {
            System.out.println("Введённое число НЕ является числом Фибоначчи");
        }
    }

}
