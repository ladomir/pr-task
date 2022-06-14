package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_41 {
    /*
        Напишите класс, который принимает с клавиатуры два целых положительных числа х и у.
        Класс преобразует большее из них - в меньшее следующим образом:
            если преобразуемое число - нечетное, оно уменьшается на 1;
            если преобразуемое число - четное, его делят на два.
        Класс должен выполнить преобразование большего числа - к меньшему, указывая все промежуточные значения;
    следует указать и общее количество выполненных преобразований.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, n = 0;

            System.out.println("Введите число x: ");
        x = scanner.nextInt();

            System.out.println("Введите число y: ");
        y = scanner.nextInt();

        if (x > y) {
            if (x % 2 == 0) {
                x /= 2;
                System.out.println(x);
                n++;
                if (x >= y) {
                    x /= 2;
                    System.out.println(x);
                    n++;
                } else {
                    System.out.println("f");
                }
            }
            if (x % 2 != 0) {
                while (x != y) {
                    x--;
                    System.out.println(x);
                    n++;
                }
            }
        }

        if (y > x) {
            if (y % 2 == 0) {
                while (y != x) {
                    y /= 2;
                    System.out.println(y);
                    n++;
                }
            }
            if (y % 2 != 0) {
                while (y != x) {
                    y--;
                    System.out.println(y);
                    n++;
                }
            }
        }

            System.out.printf("Общее количество преобразований %d", n);
    }
}
