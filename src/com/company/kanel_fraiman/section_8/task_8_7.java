package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_7 {
    /*
    Напишите класс, который принимает с клавиатуры два целых положительных числа и затем выводит на экран:
        • разницу между первым и вторым, - в случае если первое больше второго;
        • разницу между вторым и первым, - в случае если второе больше первого;
        • произведение введенных значений, - в случае если они равны.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, x;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();
            System.out.println("Введите целое число:");
        b = scanner.nextInt();

        if (a > b) {
            x = a - b;
            System.out.println("Значение a > b, разность a - b равна " + x + "!");
        }
        if (b > a) {
            x = b - a;
            System.out.println("Значение b > a, разность b - a равна " + x + "!");
        }
        if (b == a) {
            x = b * a;
            System.out.println("Значения b и a равны, их произведение равно " + x + "!");
        }
    }
}
