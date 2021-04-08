package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_56_2 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых положительных числа: N и М
    (неизвестно, какое из введенных чисел больше).
    Класс должен вывести на экран все целые числа, начиная с N и заканчивая М.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N, M, begin, end;

            System.out.println("Введите целое положительное число N:");
        N = scanner.nextInt();
            System.out.println("Введите целое положительное число M:");
        M = scanner.nextInt();
            System.out.println("Отображение чисел: ");
        if (N>M) {
            begin = M;
            end = N;
        } else {
            begin = N;
            end = M;
        }
            for (int i = begin; i <= end; i++) {
                if (i != end) {
                    System.out.print(i + "+");
                } else {
                    System.out.print(i + "!");
                }
            }
        System.out.println("\nВсе числа отображены.");
    }
}
