package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_9 {
    /*
    Определим как «красивое» целое положительное трехзначное число Х,
    для которого выполняется следующее условие:
    сумма квадратов первой и последней цифр равна квадрату средней цифры.
    Напишите класс, который выводит на экран все «красивые» числа и их количество.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, i1, i2, i3, count = 0;
            System.out.println("Числовой ряд: ");
        for (i = 100; i < 1000; i++) {
            i1 = i/100;
            i2 = (i/10)%10;
            i3 = i%10;
            if (Math.pow(i1, 2) + (Math.pow(i3, 2)) == Math.pow(i2, 2)) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.printf("\nКоличество красивых чисел - %d!", count);
    }
}
