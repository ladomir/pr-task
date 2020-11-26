package com.company.kanel_fraiman.section_10;

public class task_10_1 {
    /*
    Напишите класс, который генерирует и выводит на экран случайное
    целое чисел из диапазона положительных двузначных чисел.
     */

    public static void main(String[] args) {
        int a;

        a = (int)(Math.random()*89)+10;

        System.out.printf("Сгенерированое двухзначное положительное число - %d", a);
    }
}
