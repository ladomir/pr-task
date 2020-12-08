package com.company.kanel_fraiman.section_10;

import java.util.Scanner;

public class task_10_12 {
    /*
    Напишите класс, который повторяет предыдущее задание, но предоставляет
    игроку получить, если он того захочет, еще и четвертую карту.
    Это, например, можно сделать через ввод с клавиатуры значения, и,
    если введено значение 1 (единица), то это означает согласие игрока на
    получение четвертой карты.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e;
            System.out.println("Введите целое двухзначное число a:");
        a = scanner.nextInt();

        b = (int)(Math.random()*9+2);
        c = (int)(Math.random()*9+2);
        d = (int)(Math.random()*9+2);
        e = (int)(Math.random()*9+2);

        if (a == 1) {
            System.out.printf("Четыре выброшенные карты - %d, %d %d и %d\n", b, c, d, e);
            if ((b + c + d + e) < 21) {
                System.out.println("Недобор!");
            } else if ((b + c + d + e) == 21) {
                System.out.println("Очко!");
            } else if ((b + c + d + e) == 21) {
                System.out.println("Перебор!");
            }
        } else {

            System.out.printf("Три выброшенные карты - %d %d и %d\n", b, c, d);

            if ((b + c + d) < 21) {
                System.out.println("Недобор!");
            } else if ((b + c + d) == 21) {
                System.out.println("Очко!");
            } else if ((b + c + d) == 21) {
                System.out.println("Перебор!");
            }
        }
    }
}
