package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_7 {
    /*
    Напишите класс, который принимает с клавиатуры целое число х,
    а затем - серию из 29 дополнительных целых чисел (вводимых с клавиатуры).
    Класс должен определить, сколько чисел в серии были равны значению переменной х,
    а сколько - были меньше значения переменной х.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, xN, countX = 0, countS = 0;
            System.out.println("Введите первое число: ");
        x = scanner.nextInt();
            System.out.println("Введите 11 следующих чисел: ");
        for (int i = 0; i < 29; i++) {
            xN = scanner.nextInt();
            if (xN==x) {
                countX++;
            }
            if (xN<x) {
                countS++;
            }
        }
        System.out.printf("\nКоличество чисел, равных значению x - %d, меньше значения x - %d!", countX, countS);
    }
}
