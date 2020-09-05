package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_26 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа,
    первое из которых представляет собой год рождения,
    а второе - нынешний (текущий) год.
    Класс должен вывести на экран возраст (в целых годах).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b:");
        b = scanner.nextInt();
            System.out.printf("\nгод рождения - %d;\nтекущий год - %d;", a, b);
        c = b - a;
            System.out.println("\nвозраст - " + c + " лет;");
            System.out.printf("возраст - %d лет", c);
    }
}
