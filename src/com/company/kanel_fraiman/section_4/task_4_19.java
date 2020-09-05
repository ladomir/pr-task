package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_19 {
    /*
    Напишите класс, который выполняет «линейный сдвиг влево» для четырехзначного числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xlast, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xlast = x % 1000;
        y = xlast * 10;


        System.out.println("x = " + x);
        System.out.println("xlast = " + xlast);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после линейного сдвига числа влево - " + y);
        System.out.printf("Четырёхзначное число после линейного сдвига числа влево - %d ", y);
    }
}
