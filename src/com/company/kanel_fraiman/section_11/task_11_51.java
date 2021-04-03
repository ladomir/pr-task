package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_51 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число N и
     выводит на экран серию 1+2+3+ ... +N,
     то есть серию целых положительных последовательных чисел,
     начиная с 1 и до введенного с клавиатуры значения
     (числа при выводе на экран должны разделяться знаком + ).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

            System.out.println("Введите целое положительное число a:");
        N = scanner.nextInt();
            System.out.println("Введённое целое положительное число a - ");
            System.out.println("Отображение чисел: ");
        for (int i = 1; i <= N; i++) {
            if(i<N) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "!");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
