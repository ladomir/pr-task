package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_8 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа и,
    если первое больше второго, выводит на экран их сумму, если же наоборот
    - выводит на экран их произведение. В случае же, если числа
    одинаковы, программа выводит на экран сообщение Числа равны.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите целое число");
        a = scanner.nextInt();
            System.out.println("Введите целое число");
        b = scanner.nextInt();


        if (a > b) {
            c = a + b;
            System.out.println(c);
        }
        if (a < b) {
            c = a * b;
            System.out.println(c);
        }
        if (a == b) {
            System.out.println("Числа равны!");
        }
    }
}
