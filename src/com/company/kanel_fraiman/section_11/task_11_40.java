package com.company.kanel_fraiman.section_11;

public class task_11_40 {
    /*
    Напишите класс, который выводит на экран все целые положительные трехзначные числа,
    соответствующие следующему требованию:
    произведение первой и последней цифр равно квадрату средней.
     */
    public static void main(String[] args) {

        int a, i1, i2, i3;

        System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            if (i1*i3==Math.pow(i2, 2)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
