package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_34 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит на экран 18 последующих ему чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
        for (int i = a; i <= (a+18); i++) {
                System.out.print(i + " ");
        }
        System.out.println("\nВсе числа отображены.");
    }
}
