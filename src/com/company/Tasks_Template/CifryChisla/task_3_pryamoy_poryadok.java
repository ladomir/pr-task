package com.company.Tasks_Template.CifryChisla;

import java.util.Scanner;

public class task_3_pryamoy_poryadok {
    /*
    Разбиение числа на составные цифры
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b = 1;

        System.out.println("Введите целое пожительное число: ");

        a = scanner.nextInt();

        System.out.println("Введённое целое положительное число - " + a);

        while (b <= a) {
            b *= 10;
        }

        b /= 10;

        while (b > 0) {
            System.out.print(a/b + " ");
            a %= b;
            b /= 10;
        }
    }
}
