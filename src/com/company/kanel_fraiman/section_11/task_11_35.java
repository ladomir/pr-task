package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_35 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит
    на экран 25 последующих ему нечетных чисел.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
        if(a%2==1) {
            for (int i = 0; i < 25; i++) {
                a+=2;
                System.out.print(a + " ");
            }
        } else {
                a--;
            for (int i = 0; i < 25; i++) {
                a+=2;
                System.out.print(a + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
