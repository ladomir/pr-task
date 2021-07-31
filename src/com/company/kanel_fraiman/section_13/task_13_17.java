package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_17 {
    /*

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
