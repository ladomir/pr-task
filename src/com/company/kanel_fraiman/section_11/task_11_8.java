package com.company.kanel_fraiman.section_11;

public class task_11_8 {
    /*
    Напишите класс, который выводит на экран (в одну строку) 15 случайных
    чисел из диапазона -20".+35. После каждого отрицательного числа
    следует вывести (вплотную к числу) символ«?» (знак вопроса).
     */

    public static void main(String[] args) {
        int a = -20, b = 35, i, c;

        for (i = 1; i <= 15; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);
            if (c < 0) {
                System.out.print(c + "?\t");
            } else {
                System.out.print(c + "\t");
            }
        }
    }
}
