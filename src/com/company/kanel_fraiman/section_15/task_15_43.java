package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_43 {
    /*
        Наибольший общий делитель (НОД) двух целых положительных чисел можно определить при помощи следующего метода:
    большее число уменьшается на значение меньшего до тех пор, пока числа не оказываются равными.
        Напишите класс, который принимает с клавиатуры два целых положительных числа и определяет их НОД описанным методом.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

            System.out.println("Введите число a: ");
        a = scanner.nextInt();
            System.out.println("Введите число b: ");
        b = scanner.nextInt();

        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            System.out.println("Наибольший общий делитель - " + b);
        } else {
            System.out.println("Наибольший общий делитель - " + a);
        }
    }
}
