package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_57 {
    /*
    Напишите класс, который принимает с клавиатуры целое число а,
    а затем выводит на экран серию из 15 целых чисел, начиная с 1 так,
    что каждое следующее число в серии на а больше предыдущего числа (между
    числами должен быть знак#): l#l +a#l +2а# ...
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, a, n;
            System.out.println("Введите число a:");
        a = scanner.nextInt();

        System.out.println("Отображение чисел: ");
            for (i = 1, n = 1; i <= 15; i++, n = n + a) {
                if(i!=15) {
                    System.out.print(n + "#");
                } else {
                    System.out.print(n + "!");
                }
            }
        System.out.println("\nВсе числа отображены.");
    }
}
