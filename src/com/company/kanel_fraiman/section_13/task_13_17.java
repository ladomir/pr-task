package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_17 {
    /*
        Последовательность Фибоначчи - последовательность целых чисел,
    построенная по следующему правилу: каждый член последовательности,
    начиная с 3-го, равен сумме двух предыдущих.
        Напишите класс, который получает с клавиатуры два первых члена последовательности
    и целое положительное число N. Класс подсчитает и
    выведет на экран сумму первых N членов последовательности Фибоначчи.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 1, b = 1, n, fib;
            System.out.println("Введите значение количества чисел последоваельности Фибоначчи: ");
        n = scanner.nextInt();
            System.out.print(a + "\t" + b + "\t");
        for (int i = 0; i < (n - 2); i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(fib + "\t");
        }
    }
}
