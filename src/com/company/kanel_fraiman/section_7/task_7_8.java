package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_8 {
    /*
    Напишите класс, который принимает с клавиатуры два числа, первое
    из которых - количество учеников в классе, а второе - количество
    столов в классной комнате. Программа должна проверить, всем ли
    ученикам будет, где сесть.
    Предполагается, что за столом могут сидеть два ученика.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите количество учеников в классе");
        a = scanner.nextInt();
            System.out.println("Введите количество стулов в классной комнате");
        b = scanner.nextInt();
        if (a <= 2 * b) {
            System.out.println("Мест хватит на всех!");
        } else {
            System.out.println("Мест на всех не хватит!");
        }
    }
}
