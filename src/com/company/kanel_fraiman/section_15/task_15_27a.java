package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_27a {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, b = 9, c, d = 1, ch, ch1 = 2, count = 0, positions = 1;

        System.out.println("Введите целое пожительное число: ");

        c = scanner.nextInt();
        ch = (int) (Math.random() * (b - a + 1) + a);

        System.out.println(ch);

        while (d <= c) {
            d *= 10;
        }

        d /= 10;

        for (int i = c; i != 0; i /= 10) {
            if (i == ch1) {
                count++;
            }
        }
        System.out.printf("Сгенерировання цифра в числе встречается %d раз(а)\n", count);

        System.out.print("Сгенерировання цифра в числе находится на позиции № " );
        while (d > 0) {
            for (int i = 1; i <= d; i++) {
                if (c/d == ch1) {
                    positions = i;
                    System.out.print(positions + " ");
                }
                c %= d;
                d /= 10;
            }
        }
    }
}
