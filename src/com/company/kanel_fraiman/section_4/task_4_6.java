package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_6 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное трехзначное число и
    выводит его на экран в «полном виде»: например, для числа 364 это будет выглядеть как 300+60+4.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a % 10; // b = 8;
        c = a % 100 - b; // c = 50;
        d = a - a % 100; // d = 200;

        System.out.println(d + "+" + c + "+" + b);
        System.out.printf("%d+%d+%d", d, c, b);
    }
}
