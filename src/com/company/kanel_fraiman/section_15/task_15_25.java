package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_25 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число и выводит на экран его первую цифру.
    Например, для числа 7659 на экран будет выведено 7.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b = 1;

        System.out.println("Введите целое пожительное число: ");

        a = scanner.nextInt();

        while (b <= a) {
            b *= 10;
        }

        b /= 10;

        while (b > 0) {
            System.out.print(a / b + " ");
            break;
        }
    }
}
