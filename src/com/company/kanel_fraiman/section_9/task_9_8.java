package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_8 {
    /*
    Назовем билет с шестизначным номером «счастливым», если сумма
    первых трех его цифр равна сумме последних трех его цифр и обе эти
    суммы являются четными.
    Напишите класс, который принимает с клавиатуры шестизначный номер
    билета и проверяет, является ли он «счастливым» или не является.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, b1, b2, b3, c, c1, c2, c3, d, e;
            System.out.println("Введите шестизначное число:");
        a = scanner.nextInt();

        b = a / 1000;
            System.out.println(b);
        c = a % 1000;
            System.out.println(c);

        b1 = b / 100;
        b2 = (b / 10) % 10;
        b3 = b % 10;

        c1 = c / 100;
        c2 = (c / 10) % 10;
        c3 = c % 10;

        d = b1 + b2 + b3;
            System.out.println(d);
        e = c1 + c2 + c3;
            System.out.println(e);

        if(d == e && d %2 == 0 && e %2 == 0 ) {
            System.out.printf("Билет с номером %d является счастливым", a);
        } else {
            System.out.printf("Билет с номером %d НЕ является счастливым", a);
        }
    }
}
