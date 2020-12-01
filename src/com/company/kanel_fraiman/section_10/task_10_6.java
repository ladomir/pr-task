package com.company.kanel_fraiman.section_10;

public class task_10_6 {
    /*
    Напишите класс, который генерирует случайное положительное двузначное
    число, а затем генерирует три целых двузначных числа, не
    меньших первого.
     */
    public static void main(String[] args) {
        int a, b, c, d;

        a = (int)(Math.random()*90+10);

        System.out.printf("Сгенерированое целое положительное число a равно - %d\n", a);

        b = (int)(Math.random()*(99-a+1)+a);
        c = (int)(Math.random()*(99-a+1)+a);
        d = (int)(Math.random()*(99-a+1)+a);

        System.out.printf("Сгенерированные числа b, c и d равны %d, %d и %d соответственно.", b, c, d);
    }
}
