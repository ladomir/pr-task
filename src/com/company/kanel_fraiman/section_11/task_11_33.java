package com.company.kanel_fraiman.section_11;

public class task_11_33 {
    /*
    Напишите класс, который выводит на экран положительные трехзначные числа,
    делящиеся без остатка на 11 (начиная с наименьшего).
     */
    public static void main(String[] args) {
        int i1, i2;
        for (int i = 100; i < 1000; i++) {
            if (i%11==0) {
                System.out.print(i + " ");
            }
        }
    }
}
