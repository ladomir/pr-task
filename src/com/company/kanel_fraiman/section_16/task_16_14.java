package com.company.kanel_fraiman.section_16;

public class task_16_14 {
    /*
    Напишите класс, который выводит на экран все простые двузначные числа.
    Класс также должен определить количество и сумму этих чисел.
     */
    public static void main(String[] args) {
        int a = 99, n = 0, sumI = 0;
        System.out.print("Простые двухзначные числа: ");
        for (int i = 10; i <= a; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    sum += j;
                }
            }
            if (sum == 1) {
                n++;
                sumI += i;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\nКоличество простых чисел - %d, их сумма - %d", n, sumI);
    }
}
