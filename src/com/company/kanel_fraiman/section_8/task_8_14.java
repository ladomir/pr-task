package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_14 {
    /*
    Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, является ли в нем первая цифра (десятков)
    больше второй (единиц). В соответствии с результатом проверки
    надо вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();

        a1 = a / 10;
        a2 = a % 10;

        if (a1 > a2) {
            System.out.println("Первая цифра больше второй!");
        } else {
            System.out.println("Первая цифра НЕ больше второй!");
        }
    }
}
