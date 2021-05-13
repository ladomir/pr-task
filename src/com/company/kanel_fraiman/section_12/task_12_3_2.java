package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_3_2 {
    /*
    Напишите класс, который принимает с клавиатуры 12 целых чисел
    и выводит на экран информацию о том, сколько из них были больше, чем первое число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, count = 0;
            System.out.println("Введите первое число: ");
        a1 = scanner.nextInt();
            System.out.println("Введите 11 следующих чисел: ");
        for (int i = 0; i < 11; i++) {
            a = scanner.nextInt();
            if (a1<a) {
                count++;
            }
        }
        System.out.printf("\nКоличество чисел, больших за первое - %d!", count);
    }
}
