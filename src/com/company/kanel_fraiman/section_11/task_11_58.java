package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_58 {
    /*
    Напишите класс, который принимает с клавиатуры целое число N,
    а затем принимает с клавиатуры N целых чисел.
    Для каждого вводимого с клавиатуры неотрицательного числа следует
    вывести на экран его квадрат, а для остальных чисел - текст Пропускаем.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, a, N;
            System.out.println("Введите число N:");
        N = scanner.nextInt();
            System.out.println("Отображение чисел: ");
        for (i = 0; i <= N; i++) {
            a = scanner.nextInt();
            if(i!=N) {
                if(a>0) {
                    System.out.print(Math.pow(a, 2) + ", ");
                } else {
                    System.out.println("Пропускаем, ");
                }
            } else {
                if(a>0) {
                    System.out.print(Math.pow(a, 2) + "!");
                } else {
                    System.out.println("Пропускаем!");
                }
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
