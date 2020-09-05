package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_4 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и,
    если оно положительное, увеличивает его вдвое.
    Класс должен выводить на экран новое значение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("Введи число");
        a = scanner.nextInt();

        if (a > 0) {
            a = a * 2;
            System.out.println(a);
        }
    }
}
