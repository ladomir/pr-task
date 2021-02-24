package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_28 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число,
    а затем выводит на экран все целые положительные трехзначные числа,
    сумма цифр которых равна введенному с клавиатуры значению.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, i1, i2, i3;
        System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            if (i1+i2+i3==a) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
