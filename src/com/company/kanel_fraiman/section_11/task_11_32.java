package com.company.kanel_fraiman.section_11;

public class task_11_32 {
    /*
    Напишите класс, который выводит на экран положительные двузначные числа,
    заканчивающиеся на цифру 7 (начиная с наибольшего).
     */
    public static void main(String[] args) {
        int i1, i2;
        for (int i = 100; i > 10; i--) {
            i1 = i / 10;
            i2 = i % 10;
            if (i2==7) {
                System.out.print(i + " ");
            }
        }
    }
}
