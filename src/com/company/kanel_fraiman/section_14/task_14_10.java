package com.company.kanel_fraiman.section_14;

public class task_14_10 {
    /*
    Напишите класс, который генерирует 25 целых положительных трехзначных чисел
    и выводит на экран порядковый номер числа, сумма цифр которого была максимальной.
     */
    public static void main(String[] args) {

        int a = 100, b = 999, c, c1, c2, c3, position = 1, n = 25, max = 0, sum = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            c1 = c / 100;
            c2 =  (c % 100) / 10;
            c3 = c % 10;

            sum = c1 + c2 + c3;

            System.out.println(c1 + " " + c2 + " " + c3 + " " + sum);

            if(sum > max){
                max = sum;
                position=i+1;
            }
        }
        System.out.printf("\nчисло, сумма цифр которого максимальная, - %d (%d-е по счёту).", max, position);
    }
}
