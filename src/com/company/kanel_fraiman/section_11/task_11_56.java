package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_56 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых положительных числа: N и М
    (неизвестно, какое из введенных чисел больше).
    Класс должен вывести на экран все целые числа, начиная с N и заканчивая М.
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
            for (int i = M; i <= N; i++) {
                if (i != N) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i + "!");
                }
            }
        } else if (N==M) {
            System.out.println("Введённые числа равны между собой!");
        } else {
            for (int i = N; i <= M; i++) {
                if (i != M) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i + "!");
                }
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
