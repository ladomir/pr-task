package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_16 {
    /*
        Математическая последовательность задана формулой ее любого члена: an = (2n-1)0·5
        Напишите класс, который принимает с клавиатуры число членов последовательности (n)
    и вычисляет сумму этой последовательности.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        double x, sum = 0;

        System.out.println("Введите значение числа членов последовательности n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            x = Math.sqrt(2 * i - 1);
            sum += x;
            System.out.println(x + "\t");
        }

        System.out.printf("Сумма последовательности равна %.2f", sum);
    }
}
