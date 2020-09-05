package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_10 {
    /*
    Напишите программу, которая принимает с клавиатуры число и превращает
    его в положительное, если оно отрицательное либо в ноль во
    всех остальных случаях.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите число");
        a = scanner.nextInt();
        if (a < 0) {
            a = a * (-1);
                System.out.println(a);
        } else {
            a = 0;
            System.out.println(a);
        }
    }
}
