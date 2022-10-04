package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_11a {
    /*
   Напишите метод, который принимает в качестве параметра целое число и возвращает количество цифр в этом числе.
    */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        System.out.println("Количество цифр числа - " + amount(a));
    }
    public static int amount(int a) {
        int count = 0;
        while (a>0) {
            count++;
            a /= 10;
        }
        return count;
    }
}
