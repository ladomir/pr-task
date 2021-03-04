package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_36 {
    /*
    Напишите класс, который принимает с клавиатуры целое число
    и выводит на экран 10 предшествующих ему чисел,
    причем разница между значениями этих чисел должна быть равна 6.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
            for (int i = 0; i < 10; i++) {
                a -= 6;
                    System.out.print(a + " ");
            }
        System.out.println("\nВсе числа отображены.");
    }
}
