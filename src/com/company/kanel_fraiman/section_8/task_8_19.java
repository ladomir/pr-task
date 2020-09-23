package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_19 {
    /*
    Назовем «степенью четности» числа количество четных цифр в его составе
    (например, степень четности для 2346 равна 3).
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и определяет, какова его «степень четностю>. В соответствии
    с результатом проверки надо вывести на экран соответствующее
    текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);



        if (a1 % 2 == 0 && a2 % 2 == 0 && a3 % 2 == 0) {
            System.out.println("\"Степень чётности\" введённого числа равно 3!");
        } else if (a1 % 2 == 0 && a2 % 2 == 0 || a1 % 2 == 0 && a3 % 2 == 0 ||
                a2 % 2 == 0 && a3 % 2 == 0) {
            System.out.println("\"Степень чётности\" введённого числа равно 2!");
        } else if (a1 % 2 == 0 || a2 % 2 == 0 || a3 % 2 == 0) {
            System.out.println("\"Степень чётности\" введённого числа равно 1!");
        } else {
            System.out.println("\"Степень чётности\" введённого числа равно 0!");
        }
    }
}
