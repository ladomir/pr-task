package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_20 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое число
    и выводит на экран следующие значения (каждое в отдельной строке):
    снова введенное число и число, противоположное введенному числу.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a *(-1);
            System.out.println(a);
            System.out.println(b);
            System.out.printf("%d \n %d", a, b);
    }
}
