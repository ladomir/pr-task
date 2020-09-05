package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_5 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и,
    если оно равно нулю, выводит на экран сообщение Ноль.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введие целое число");
        a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Ноль");
        }
    }
}
