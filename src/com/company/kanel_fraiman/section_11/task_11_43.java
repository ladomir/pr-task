package com.company.kanel_fraiman.section_11;

public class task_11_43 {
    /*
    Напишите класс,
    который выводит на экран (в строку с пробелами) все двузначные целые положительные числа,
    в которых и цифра единиц, и цифра десятков делятся без остатка на три.
     */
    public static void main(String[] args) {

        int i, i1, i2;

        System.out.println("Отображение чисел: ");
        for (i = 10; i < 100; i++) {
            i1 = i / 10;
            i2 = i % 10;
            if (i1%3==0&&i2%3==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
