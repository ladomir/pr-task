package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_34 {
    /*
    Напишите класс,
    который сначала заносит в переменную строковое значение Привет,
    а затем принимает с клавиатуры ваше имя.
    Класс должен вывести на экран в одной строке сообщение,
    составленное из строкового значения Привет, знака «запятая» и вашего имени.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String greeting = new String("Привет");
            System.out.println("Введите имя:");
        String name = scanner.nextLine();
            System.out.println(greeting + ", " + name + "!");
        System.out.printf("Привет, %s ", name + "!");
    }
}
