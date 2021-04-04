package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_52 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число N
    и выводит на экран серию N+(N-l)+(N-2)+ ... + 1,
    то есть серию целых положительных последовательных чисел,
    начиная с введенного с клавиатуры значения и до 1
    (числа при выводе на экран должны разделяться знаком+).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

            System.out.println("Введите целое положительное число a:");
        N = scanner.nextInt();
            System.out.println("Введённое целое положительное число a - ");
            System.out.println("Отображение чисел: ");
        for (int i = N; i > 0; i--) {
            if(i>1) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "!");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
