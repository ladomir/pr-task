package com.company.kanel_fraiman.section_16;

public class task_16_17 {
    /*
    Напишите класс, который выводит на экран все простые двузначные числа, квадрат которых не превышает 999.
     */
    public static void main(String[] args) {
        int quadrate = 0;
        System.out.print("Все простые двузначные числа, квадрат которых не превышает 999: ");
        for (int i = 10; i <= 99; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum == 1) {
                quadrate = i*i;
                if (quadrate < 1000) {
                    System.out.print(i + " (" + quadrate + ") ");
                }
            }
        }
    }
}
