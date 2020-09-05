package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_17 {
    /*
    Напишите программу,
    которая выполняет перестановку над четырехзначным числом.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xfirst, xlast, xmiddle, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xfirst = x / 1000;
        xlast = x % 10;
        xmiddle = (x / 10) % 100;
        y = xlast * 1000 + xmiddle * 10 + xfirst;


        System.out.println("x = " + x);
        System.out.println("xfirst = " + xfirst);
        System.out.println("xlast = " + xlast);
        System.out.println("xmiddle = " + xmiddle);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после операции перестановки - " + y);
        System.out.printf("Четырёхзначное число после операции перестановки - %d ", y);
    }
}
