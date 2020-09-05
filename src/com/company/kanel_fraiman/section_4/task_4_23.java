package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_23 {
    /*
    Напишите класс, который выполняет «сдвиг вправо по кругу» для четырехзначного числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xfirst, xlast, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xfirst = x / 10;
        xlast = x % 10;
        y = xlast * 1000 + xfirst;


        System.out.println("x = " + x);
        System.out.println("xfirst = " + xfirst);
        System.out.println("xlast = " + xlast);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после сдвига вправо по кругу - " + y);
        System.out.printf("Четырёхзначное число после сдвига вправо по кругу - %d ", y);
    }
}
