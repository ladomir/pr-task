package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_8 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное трехзначное число.
    Затем следует построить новое значение, составленное из цифр числа,
    введенного с клавиатуры, но в обратном порядке.
    После этого новое значение следует уменьшить на 20,
    и окончательный результат вывести на экран.
    То есть для числа 327 следует построить число 723 и вывести на экран 703.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, x;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;
        x = d * 100 + c * 10 + b;
        x -= 20;

        System.out.println(x);
        System.out.printf("x = %d", x);
    }
}
