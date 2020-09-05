package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_11 {
    /*
    Напишите класс, который принимает с клавиатуры два различных числа.
    Класс должен вывести на экран эти числа в порядке возрастания -
    в одной строке, а в другой - их же, но в порядке убывания.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите число");
        a = scanner.nextInt();
            System.out.println("Введите число");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + ", " + b + "\n" + b + ", " + a);
        } else {
            System.out.println(b + ", " + a + "\n" + a + ", " + b);
        }
    }
}
