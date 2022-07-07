package com.company.kanel_fraiman.section_16;

public class task_16_4 {
    /*
    Напишите класс, который выводит на экран построчно таблицу умножения:
    в первой строке -умножение чисел от 1 до 9 на 1, во второй - умножение на 2,
    и так далее до умножения чисел от 1 до 9 на 12.
     */
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
