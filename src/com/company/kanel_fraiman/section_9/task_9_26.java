package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_26 {
    /*
    Назовем двузначное число «внутренним» по отношению к четырехзначному
    числу, если какая-то пара смежных цифр в четырехзначном
    числе образует двузначное число.
    Напишите класс, который принимает с клавиатуры два положительных
    числа - двузначное и четырехзначное - и проверяет, является ли двузначное
    «внутренним» по отношению к четырехзначному.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, b1, b2, b3;
            System.out.println("Введите двухзначное число a:");
        a = scanner.nextInt();
            System.out.println("Введите четырёхзначное число b:");
        b = scanner.nextInt();

        b1 = b / 100;
        b2 = (b / 10) % 100;
        b3 = b % 100;

        if (a == b1 || a == b2 || a == b3) {
            System.out.println("Число является \"внутренним\" по отношению к четырёхзначному!");
        } else {
            System.out.println("Число НЕ является \"внутренним\" по отношению к четырёхзначному!");
        }
    }
}
