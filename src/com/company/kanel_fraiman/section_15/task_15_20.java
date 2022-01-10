package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_20 {
    /*
    Напишите класс, который вводит с клавиатуры целые положительные числа до тех пор,
    пока не будет введено число, сумма цифр которого равна 5.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = scanner.nextInt();

        b = a % 9;

        while (b != 5) {
            a = scanner.nextInt();
            b = a % 9;
        }
        System.out.println(b);
    }
}
