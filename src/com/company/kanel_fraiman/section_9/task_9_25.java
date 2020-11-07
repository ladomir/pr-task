package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_25 {
    /*
    Целое трехзначное число называется «ЯМОЙ», если его средняя цифра меньше крайних.
    Напишите класс, который принимает с клавиатуры положительное
    трехзначное число и проверяет, является ли оно «ЯМОЙ».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
            System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        if (a2 < a1 && a2 < a3) {
            System.out.println("Число называется \"ямой\"!");
        } else {
            System.out.println("Число НЕ называется \"ямой\"!");
        }
    }
}
