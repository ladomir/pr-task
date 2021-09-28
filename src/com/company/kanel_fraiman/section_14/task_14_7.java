package com.company.kanel_fraiman.section_14;

public class task_14_7 {
    /*
    Напишите класс, который генерирует 20 целых положительных двузначных чисел и выводит на экран число,
    сумма цифр которого была максимальной.
     */
    public static void main(String[] args) {

        int a = 10, b = 99, c, c1, c2, n = 20, max = 0, sum = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            c1 = c / 10;
            c2 = c % 10;

            sum = c1 + c2;

            System.out.println(c1 + " " + c2 + " " + sum);

            if(sum > max){
                max = sum;
            }
        }

        System.out.printf("\nчисло, сумма цифр которого максимальная - %d;", max);
    }
}
