package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_7 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число и,
    если оно как минимум трехзначное и положительное, уменьшает его на 1.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("Введите целое число");
        a = scanner.nextInt();

        if (a >= 100) {
            a = a - 1;
            System.out.println(a);
        }
    }
}
