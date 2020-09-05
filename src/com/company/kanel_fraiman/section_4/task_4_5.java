package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_5 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное двузначное число и
    выводит его на экран в «полном виде»: например, для числа 34 это будет выглядеть как 30+4.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

        b = a % 10;
        c = a - b;

        System.out.println(c + " + " + b);
        System.out.printf("%d + %d", c, b);
    }
}
