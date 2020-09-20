package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_16 {
    /*
    Трехзначное число называется «симметричным», если первая и последняя
    его цифры одинаковы.
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, является ли оно «симметричным». В соответствии
    с результатом проверки надо вывести на экран соответствующее
    текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a3;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a3 = a % 10;

        if (a1 == a3) {
            System.out.println("Введённое число \"симметричное\"!");
        } else {
            System.out.println("Введённое число \"несимметричное\"");
        }
    }
}
