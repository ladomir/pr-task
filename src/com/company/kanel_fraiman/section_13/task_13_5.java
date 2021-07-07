package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_5 {
    /*
    Назовем «базой» положительного числа Х сумму всех положительных целых чисел, меньших Х.
    Напишите класс, который принимает с клавиатуры положительное целое число Х и подсчитывает его «базу».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, sum = 0, n, count = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
                sum += i;
                System.out.print(i + "\t");
        }
        System.out.println("\n\"База\" положительного числа X равна " + sum);
    }
}
