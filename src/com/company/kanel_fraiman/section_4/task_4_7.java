package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_7 {
    /*
    Напишите класс,
    который принимает с клавиатуры целое положительное двузначное число.
    Затем следует построить новое значение, составленное из цифр числа,
    введенного с клавиатуры, но в обратном порядке.
    После этого новое значение следует увеличить на 8,
    и окончательный результат вывести на экран.
    То есть для числа 37 следует построить число 73 и вывести на экран 81.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите двухзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое двухзначное число - " + a);

            // если a = 37;
        b = a / 10; // b = 3;
        c = a % 10; // c = 7;
        d = c * 10 + b; // d = 73;
        d += 8; // d = 81;

            System.out.println(d);
            System.out.printf("d = %d", d);
    }
}
