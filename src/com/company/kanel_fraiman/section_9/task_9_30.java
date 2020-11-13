package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_30 {
    /*
    Напишите класс, который принимает с клавиатуры трехзначное число
    и проверяет, на какое число из составляющих его цифр оно делится
    (без остатка).
    Следует учесть возможность того, что одной из цифр в проверяемом
    числе может быть и 0.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
            System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        if (a % a1 == 0) {
            System.out.printf("Число без отстака делится на %d\n", a1);
        } if (a % a2 == 0) {
            System.out.printf("Число без отстака делится на %d\n", a2);
        } if (a % a3 == 0) {
            System.out.printf("Число без отстака делится на %d\n", a3);
        } if (a1 == 0) {
            System.out.printf("Число %d равно 0\n", a1);
        } if (a2 == 0) {
            System.out.printf("Число %d равно 0\n", a2);
        } if (a3 == 0) {
            System.out.printf("Число %d равно 0\n", a3);
        }
    }
}
