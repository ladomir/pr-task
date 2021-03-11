package com.company.kanel_fraiman.section_11;

public class task_11_37 {
    /*
    Напишите класс, который генерирует 20 случайных чисел из диапазона от -18 до 18.
    Для каждого отрицательного числа следует вывести на экран само число и его квадрат (в одной строке),
    для положительного - само число
    и округленный (по правилам округления, принятым в математике)  корень из числа.
    Значения, равные нулю, не выводятся на экран вообще.
     */
    public static void main(String[] args) {
        int a = -18, b = 18, i, c;

        for (i = 1; i <= 20; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);

            if (c < 0) {
                if (i >= 1 && i <= 19) {
                    System.out.print(c + " (" + Math.pow(c, 2) + "),\t");
                } else {
                    System.out.print(c + " (" + Math.pow(c, 2) + ").\t");
                }
            }
            if (c > 0) {
                if (i >= 1 && i <= 19) {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c)+0.5) + "),\t");
                } else {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c)+0.5) + ").\t");
                }
            }
        }
    }
}
