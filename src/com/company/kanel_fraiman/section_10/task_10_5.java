package com.company.kanel_fraiman.section_10;

public class task_10_5 {
    /*
    Напишите класс, который генерирует случайное положительное двузначное
    число, а затем генерирует три целых положительных числа,
    меньших первого.
     */
    public static void main(String[] args) {
        int a, b, c, d;

        a = 10 + (int)(Math.random()*90);

            System.out.printf("Сгенерированое целое положительное число a равно - %d\n", a);

        b = (int)(Math.random()*a);
        c = (int)(Math.random()*a);
        d = (int)(Math.random()*a);

        System.out.printf("Сгенерированные числа b, c и d равны %d, %d и %d соответственно.", b, c, d);
    }
}
