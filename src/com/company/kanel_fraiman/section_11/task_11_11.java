package com.company.kanel_fraiman.section_11;

public class task_11_11 {
    /*
    Напишите класс, который выводит на экран (в одну строку) 11 случайных
    чисел из диапазона «положительные двузначные». После каждого
    числа, делящегося на 5 без остатка, следует вывести (в обычных скобках,
    вплотную к числу) сумму его цифр; для остальных чисел следует вывести
    произведение его цифр (в квадратных скобках, вплотную к числу).
     */

    public static void main(String[] args) {
        int a = 10, b = 99, i, c, c1, c2;

        for (i = 1; i <= 11; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);

            c1 = c / 10;
            c2 = c % 10;

            if (c %5 == 0 && i ==11) {
                //System.out.print(c + "(" + (c1 + c2) + ")\t");
                if (i >= 1 && i <= 10) {
                    System.out.println(c + "(" + (c1 + c2) + "),\t");
                } else {
                    System.out.println(c + "(" + (c1 + c2) + ").\t");
                }
            } else {
                if (i >= 1 && i <= 10) {
                    System.out.print(c + "[" + (c1 + c2) + "],\t");
                } else {
                    System.out.print(c + "[" + (c1 + c2) + "].\t");
                }
            }
        }
    }
}
