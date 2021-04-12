package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_60 {
    /*
    Напишите класс, который принимает с клавиатуры целое число N,
    а затем выводит на экран все степени двойки от 1 до N включительно.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N;
            System.out.println("Введите число N:");
        N = scanner.nextInt();

            System.out.println("Отображение чисел: ");
        for (int i = 1; i <= N; i++) {
            if(i!=N) {
                System.out.print((int)Math.pow(2, i) + ", ");
            } else {
                System.out.print((int)Math.pow(2, i) + "!");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
