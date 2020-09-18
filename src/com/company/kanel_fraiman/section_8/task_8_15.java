package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_15 {
    /*
    Напишите класс, который принимает с клавиатуры двузначное положительное
    число и проверяет, какая из его двух цифр является большей.
    В соответствии с результатом проверки надо вывести на экран
    соответствующее текстовое сообщение. Не следует выводить на экран
    никакого сообщения, если число составлено из одинаковых цифр.
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
        } else if (a2 > a1) {
            System.out.println("Втроая цифра больше первой!!");
        } else {

        }
    }
}
