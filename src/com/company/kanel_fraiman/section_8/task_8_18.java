package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_18 {
    /*
    Четырехзначное число называется «парно-симметричным», если две
    его первых цифры и две его последних цифры образуют одинаковые
    числа (например - 5252).
    Напишите класс, который принимает с клавиатуры четырехзначное
    положительное число и определяет, является ли оно «парно-симметричным».
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2;
            System.out.println("Введите четырёхзначное число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = a % 100;

        System.out.println(a1);
        System.out.println(a2);

        if (a1 ==a2) {
            System.out.println("Введённое число \"парно-симметричное\"!");
        } else {
            System.out.println("Введённое число не является \"парно-симметричным\"!");
        }
    }
}
