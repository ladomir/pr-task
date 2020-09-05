package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_22 {
    /*
    Назовем «сдвигом числа вправо по кругу» операцию,
    при которой все цифры числа сдвигаются вправо, а число единиц (последняя цифра)
    перемещается в старший разряд числа (первая цифра).
    Например, из числа 1234 получается число 4123.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «сдвигом вправо по кругу».
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
