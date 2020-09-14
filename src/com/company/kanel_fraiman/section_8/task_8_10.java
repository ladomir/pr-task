package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_10 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран его квадрат, но только в случае, если введенное число
    отрицательно. В противном случае - на экран выводится сообщение
    Ошибка.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число:");
        a = scanner.nextInt();

        if (a < 0) {
            System.out.println(Math.pow(a, 2));
        } else {
            System.out.println("Ошибка");
        }
    }
}
