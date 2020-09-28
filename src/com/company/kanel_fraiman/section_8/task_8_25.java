package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_25 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное
    число, и затем:
    • в случае если введено четное число, - принимает с клавиатуры
    дробное число и выводит на экран произведение этих двух чисел;
    • в противном случае - принимает с клавиатуры целое число и выводит
    на экран сумму этих двух чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b = 0;
        double c = 0.0;
            System.out.println("Введите целое положительное число:");
        a = scanner.nextInt();

        if (a % 2 == 0) {
                System.out.println("Введите дробное число:");
            c = scanner.nextDouble();
                System.out.println((double) a * c);
        }
        else {
                System.out.println("Введите целое число:");
            b = scanner.nextInt();
                System.out.println(a + b);
        }
    }
}
