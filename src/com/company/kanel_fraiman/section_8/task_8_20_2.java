package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_20_2 {
    /*
    Напишите класс, который принимает с клавиатуры трехзначное положительное
    число и проверяет, содержится ли в нем хотя бы один ноль.
    По результатам проверки надо вывести на экран соответствующее текстовое
    сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3, count = 0;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a / 10) % 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        if (a1 == 0) {
            count++;
        } if (a2 == 0) {
            count++;
        } if (a3 == 0) {
            count++;
        }
            System.out.println("В введённом числе количество нолей равно " + count);
    }
}
