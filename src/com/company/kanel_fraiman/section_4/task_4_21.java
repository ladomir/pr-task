package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_21 {
    /*
    Напишите класс, который выполняет «сдвиг влево по кругу» для четырехзначного числа.

    int х, xfirst, xlast, у;
x=in.nextlnt();
xfirst=x/1000;
xlast=x%1000;
y=xlast*l0+xfirst;
System.out.println(y);
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xfirst, xlast, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xfirst = x / 1000;
        xlast = x % 1000;
        y = xlast * 10 + xfirst;


        System.out.println("x = " + x);
        System.out.println("xfirst = " + xfirst);
        System.out.println("xlast = " + xlast);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после сдвига влево по кругу - " + y);
        System.out.printf("Четырёхзначное число после сдвига влево по кругу - %d ", y);
    }
}
