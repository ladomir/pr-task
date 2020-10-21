package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_11 {
    /*
    Трехзначное число называется «плоским», если оно составлено из одинаковых цифр.
    Напишите класс, который принимает с клавиатуры трехзначное число и проверяет,
    является ли оно «плоским».
    В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
        System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        if (a1 == a2 && a1 ==a3) {
            System.out.println("Число является \"плоским\"!");
        } else {
            System.out.println("Число НЕ является \"плоским\"!");
        }
    }
}
