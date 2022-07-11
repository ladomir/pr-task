package com.company.kanel_fraiman.section_16;

public class task_16_6 {
    /*
    Старинная задача: сколько можно купить быков и коров на 100 рублей, если плата за быка 10 рублей, за корову- 5 рублей (во всех вариантах).
    Напишите класс, который выводит на экран все возможные варианты решения задачи.
     */
    public static void main(String[] args) {
        int b = 10, k = 5, n = 100;
            System.out.print("На 100  рублей можно купить:");
        for (int i = 0; i <= n/b; i++) {
            for (int j = 0; j <= n/k; j++) {
                if (i*b+j*k==n) {
                    System.out.printf("\n\t- быков - %d, коров - %d;", i, j);
                }
            }
        }
    }
}
