package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_49 {
    /*
    Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное число;
    • затем выводит на экран (в строку с пробелами) четырехзначные целые положительные числа,
    в которых предварительно введенное двузначное число является «внутренней» частью
    (как, например, 3 для 1523, или 6237, или 4230).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, i1, i2, i3;

            System.out.println("Введите двухзначное число a:");
        a = scanner.nextInt();
            System.out.println("Отображение чисел: ");
        for (int i = 1000; i < 10000; i++) {
        i1 = i / 100;
        i2 = (i%1000)/10;
        i3 = i % 100;
        if (i1==a||i2==a||i3==a) {
            System.out.print(i + " ");
        }
    }
        System.out.println("\nВсе числа отображены.");
}
}
