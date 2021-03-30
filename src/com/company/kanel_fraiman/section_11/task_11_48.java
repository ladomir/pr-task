package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_48 {
    /*
    Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное число;
    • затем выводит на экран (в строку с пробелами) трехзначные целые положительные числа,
    в которых предварительно введенное двузначное число является «внутренней» частью
    (как, например, 23 для 123 или 623).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
        int i1, i2;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Отображение чисел: ");

                for (int i = 100; i < 1000; i++) {
                    i1 = i / 10;
                    i2 = i % 100;
                    if (i1==a||i2==a) {
                        System.out.print(i + " ");
                    }
            }
        System.out.println("\nВсе числа отображены.");
    }
}
