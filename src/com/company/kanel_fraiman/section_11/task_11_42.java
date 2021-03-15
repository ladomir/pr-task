package com.company.kanel_fraiman.section_11;

public class task_11_42 {
    /*
    Напишите класс, который выводит на экран все целые трехзначные числа
    (и положительные, и отрицательные), соответствующие следующему требованию:
    эти числа делятся без остатка на сумму собственных цифр
     */
    public static void main(String[] args) {

        int i1, i2, i3;

        System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            if (i%(i1+i2+i3)==0) {
                System.out.print(i + " " + -i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
