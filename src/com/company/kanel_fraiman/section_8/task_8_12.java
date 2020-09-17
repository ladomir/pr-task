package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_12 {
    /*
    Напишите класс, который принимает с клавиатуры оценку ученика
    (целое число) и проверяет, не является ли введенное значение ошибочным.
    На экран должно выводиться соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите оценку ученика:");
        a = scanner.nextInt();

        if (a > 0 && a < 6) {
            System.out.println("Введённое значение верное!");
        } else {
            System.out.println("Введённое значение ошибочное!");
        }
    }
}
