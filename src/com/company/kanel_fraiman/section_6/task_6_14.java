package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_14 {
    /*
    Напишите класс, который принимает с клавиатуры два значения: первое
    - числитель дроби, второе - ее знаменатель (можно исходить из
    предположения, что второе значение отлично от нуля).
    Класс должен определить, является ли эта дробь положительной или
    отрицательной, и вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Введите числитель");
        a = scanner.nextInt();
        System.out.println("Введите знаменатель");
        b = scanner.nextInt();

        if (a * b > 0) {
            System.out.println("Дробь положительная!");
        } else {
            System.out.println("Дробь отрицательная!");
        }
    }
}
