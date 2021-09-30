package com.company.kanel_fraiman.section_14;

public class task_14_9 {
    /*
        Напишите класс, который генерирует 24 целых трехзначных положительных числа
        и выводит на экран порядковый номер самого большого из сгенерированных чисел.
     */
    public static void main(String[] args) {

        int a = 100, b = 999, c, dn, dm = 1, n = 24, max = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            if(c > max){
                max = c;
                dn = i;
                dm = dn;
            }
        }
        System.out.printf("\nмаксимальное число - %d (%d-е по счёту).", max, dm);
    }
}
