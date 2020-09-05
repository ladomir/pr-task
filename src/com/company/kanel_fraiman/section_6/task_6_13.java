package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_13 {
    /*
    Напишите класс, который принимает с клавиатуры два значения: первое
    - числитель дроби, второе - ее знаменатель.
    Класс должен определить, является ли эта дробь «законной» (существующей),
    и вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите числитель");
        a = scanner.nextInt();
            System.out.println("Введите знаменатель");
        b = scanner.nextInt();

        if (a < b) {
            System.out.println("Дробь правильная!");
        } else {
            System.out.println("Дробь неправильная!");
        }
    }
}
