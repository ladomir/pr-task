package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_32 {
    /*
    Напишите класс,
    который принимает с клавиатуры число и выводит на экран обратное ему значение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b;
            System.out.println("Введите значение числа:");
        a = scanner.nextDouble();

        b = 1 / a;
            System.out.println("значение введенного числа " + a + " ;");
            System.out.println("число, значение которого обратное введенному, - " + b + " ;");
            System.out.printf("значение введенного числа - %.2f, " +
                    "\nчисло, значение которого обратное введенному, - %.2f;", a, b);
    }
}
