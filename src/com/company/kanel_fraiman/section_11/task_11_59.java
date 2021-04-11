package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_59 {
    /*
    Напишите класс, который читает два целых положительных числа в
    переменных А и В и проверяет, действительно ли А меньше, чем В.
    Если да, - класс должен вывести на экран А последовательных чисел,
    начиная с числа В, если нет, - класс должен вывести на экран В последовательных
    чисел, начиная с числа А.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, A, B;
            System.out.println("Введите число A:");
        A = scanner.nextInt();
            System.out.println("Введите число b:");
        B = scanner.nextInt();
            System.out.println("Отображение чисел: ");

        if (A<B) {
            for (i = A; i <= B; i++) {
                if(i!=B) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + "!");
                }
            }
        } else if (A>B) {
            for (i = B; i <= A; i++) {
                if(i!=A) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + "!");
                }
            }
        } else {
            System.out.println("Ведённые значения равны!");
        }
        System.out.println("\nВсе числа отображены.");
    }
}
