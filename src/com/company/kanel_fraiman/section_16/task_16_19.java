package com.company.kanel_fraiman.section_16;

public class task_16_19 {
    /*
    Напишите класс, который выводит на экран все трехзначные числа, для которых соблюдаются два условия:
        • само число заканчивается на О;
        • сумма нечетных делителей этого числа тоже заканчивается на О.
     */
    public static void main(String[] args) {
        int a;
        System.out.println ("Все числа: ");
        for (int i = 100; i <= 999; i+=10) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    if (j %2 == 1) {
                        sum += j;
                        if (sum %10 == 0) {
                            System.out.print("Число " + i + ": сумма всех нечётных делителей, кратная 10, равна - " + sum + "\n");
                        }
                    }

                }
            }
        }
    }
}
