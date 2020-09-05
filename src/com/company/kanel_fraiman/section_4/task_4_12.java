package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_12 {
    /*
    Назовем «длиной трехзначного числа» разницу между его первой (число сотен) и
    последней (число единиц) цифрами, умноженную на его среднюю (число десятков) цифру.
    Напишите класс, который принимает с клавиатуры целое положительное трехзначное число,
    вычисляет его «длину» и выводит результат на экран.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, length;
            System.out.println("Введите трёхзначное число:");
        a = scanner.nextInt();
            System.out.println("Введённое трёзначное число - " + a);

        b = a / 100;
        c = (a % 100) / 10;
        d = a % 10;

        length = (b - d) * c;

        System.out.println("Длина трёзначного числа равна " + length);
        System.out.printf("Длина трёзначного числа равна %d", length);
    }
}
