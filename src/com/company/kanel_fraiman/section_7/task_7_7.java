package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_7 {
    /*
    Напишите класс, который принимает с клавиатуры два числа,
    первое из которых - количество учеников в классе,
    а второе - количество стульев в классной комнате.
    Программа должна проверить, всем ли ученикам будет, где сесть.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите количество учеников");
        a = scanner.nextInt();
            System.out.println("Введите количество стульев");
        b = scanner.nextInt();
        if (a == b) {
            System.out.println("Стульев хватает на всех учеников!");
        } else {
            System.out.println("Стульев не хватает на всех учеников!");
        }
    }
}
