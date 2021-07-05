package com.company.kanel_fraiman.section_13;

public class task_13_3 {
    /*
    Напишите класс, который генерирует серию из 20 случайных положительных двузначных чисел
    и определяет сумму четных значений в серии.
     */
    public static void main(String[] args) {

        int a = 10, b = 99, c, sum = 0;

        for (int i = 1; i <= 20; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");
            if (c%2==0) {
                sum += c;
            }
        }
        System.out.printf("\nСумма чётных значений серии равна %d!", sum);
    }
}
