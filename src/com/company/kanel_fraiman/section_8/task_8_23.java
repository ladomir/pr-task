package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_23 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа и
    изменяет их следующим образом:
    • при разных значениях, большее число уменьшается на 1, а меньшее
    - увеличивается на 1;
    • при одинаковых значениях чисел оба увеличиваются на 1.
    Программа должна вывести на экран новые значения переменных.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c = 0;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();

        if (a != b) {
            if (a > b) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
        }
        else {
            a++;
            b++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.printf("Значение a равно %d, знчение b - %d!", a, b);
    }
}
