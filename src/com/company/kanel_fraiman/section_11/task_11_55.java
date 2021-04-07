package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_55 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых положительных числа: N и М
    (неизвестно, какое из введенных чисел больше).
    Класс должен вывести на экран все четные числа
    между наименьшим и наибольшим значениями, введенными с клавиатуры.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N, M;

            System.out.println("Введите целое положительное число N:");
        N = scanner.nextInt();
            System.out.println("Введите целое положительное число M:");
        M = scanner.nextInt();
            System.out.println("Отображение чисел: ");
        if (N>M) {
            if (M%2==0) {
                for (int i = M+2; i <= N-1; i += 2) {
                    if (i < N-2) {
                        System.out.print(i + "+");
                    } else {
                        System.out.print(i + "!");
                    }
                }
            } else {
                for (int i = M+1; i <= N; i += 2) {
                    if (i < N-2) {
                        System.out.print(i + "+");
                    } else {
                        System.out.print(i + "!");
                    }
                }
            }
        } else if (N==M) {
            System.out.println("Введённые числа равны между собой!");
        } else {
            if (N%2==0) {
                for (int i = N+2; i <= M-1; i += 2) {
                    if (i < M-2) {
                        System.out.print(i + "+");
                    } else {
                        System.out.print(i + "!");
                    }
                }
            } else {
                for (int i = N+1; i <= M; i += 2) {
                    if (i < M-2) {
                        System.out.print(i + "+");
                    } else {
                        System.out.print(i + "!");
                    }
                }
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
