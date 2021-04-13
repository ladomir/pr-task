package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_1 {
    /*
    Напишите класс,
    который принимает с клавиатуры 10 целых чисел
    и выводит на экран информацию о том, сколько из них бьmи положительными.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count=0;
        for (int i = 0; i < 10; i++) {
            a = scanner.nextInt();
            if (a > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных чисел - " + count + "!");
        System.out.printf("Количество положительных чисел - %d!", count);
    }
}
