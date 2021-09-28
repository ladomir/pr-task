package com.company.kanel_fraiman.section_14;

public class task_14_8 {
    /*
        Напишите класс, который генерирует 15 целых положительных трехзначных чисел
        и выводит на экран число, сумма цифр которого была минимальной.
     */
    public static void main(String[] args) {

        int a = 100, b = 999, c, c1, c2, c3, n = 15, min = 0, sum = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            c1 = c / 100;
            c2 =  (c % 100) / 10;
            c3 = c % 10;

            sum = c1 + c2 + c3;

            System.out.println(c1 + " " + c2 + " " + c3 + " " + sum);

            if(sum < n + 1){ // вместо min = 0 -> n + 1
                min = sum;
            }
        }
        System.out.printf("\nчисло, сумма цифр которого минимальная - %d;", min);
    }
}
