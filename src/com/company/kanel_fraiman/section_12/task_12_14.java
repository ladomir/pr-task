package com.company.kanel_fraiman.section_12;

public class task_12_14 {
    /*
    Серия случайных чисел называется «уравновешенной»,
    если количество положительных и отрицательных чисел в серии - одинаково.
    Напишите класс, который генерирует серию из 30 случайных целых чисел из диапазона от -20 до 20
    и проверяет, является ли серия «уравновешенной)>.
     */
    public static void main(String[] args) {

        int a = -20, b = 20, i, c, countP = 0, countO = 0, count = 0;

        for (i = 1; i <= 30; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            if (c > 0) {
                countP++;
            }
            if (c < 0) {
                countO++;
            }
            if (c == 0) {
                count++;
            }
        }
        if (countP == countO) {
            System.out.printf("\nСерия является уравновешенной");
        } else {
            System.out.printf("\nСерия НЕ является уравновешенной");
        }
    }
}
