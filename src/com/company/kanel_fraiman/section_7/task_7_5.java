package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_5 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и определяет,
    является оно положительным или нет,
    и выводит на экран одно из двух соответствующих результатам проверки сообщений:
    Положительное число и Не положительное число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите число");
        a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Не положительное число!");
        }
    }
}
