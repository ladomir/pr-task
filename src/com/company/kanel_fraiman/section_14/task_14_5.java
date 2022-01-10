package com.company.kanel_fraiman.section_14;

public class task_14_5 {
    /*
        Напишите класс, который принимает с клавиатуры серию из 12 целых
    чисел и определяет среднее арифметическое максимума и минимума
    для этой серии.
     */
    public static void main(String[] args) {

        int a = -100, b = 100, c, sa, n = 12, min= 0, max = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            if(c < min){
                min = c;
            }
            if(c > max){
                max = c;
            }
        }

        sa = (max + min) / 2;

        System.out.printf("\nминимальное число - %d; \nмаксимальное число - %d; \nсреднне арифметическое - %d.", min, max, sa);
    }
}
