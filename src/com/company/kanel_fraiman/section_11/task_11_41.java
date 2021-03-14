package com.company.kanel_fraiman.section_11;

public class task_11_41 {
    /*
    Напишите класс, который выводит на экран целые положительные трехзначные числа,
    составленные целиком из четных цифр.
     */
    public static void main(String[] args) {

        int i1, i2, i3;

        System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            if (i1%2==0&&i2%2==0&&i3%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
